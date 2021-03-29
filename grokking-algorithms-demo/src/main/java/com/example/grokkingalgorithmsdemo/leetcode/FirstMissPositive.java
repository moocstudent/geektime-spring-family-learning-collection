package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangQi
 * @Date: 2021-03-04 16:53
 * https://leetcode-cn.com/problems/first-missing-positive/
 * 如果本题没有额外的时空复杂度要求,那么就很容易实现:
 * - 我们可以将数组所有的数放入哈希表,随后从1开始依次枚举正整数,并判断其是否在哈希表中.
 * - 我们可以从1开始依次枚举正整数,并遍历数组,判断其是否在数组中.
 * 如果数组的长度为N,那么第一种做法的时间复杂度为O(N),空间复杂度为O(N);第二种做法的时间复杂度
 * 为O(N²),空间复杂度为O(1).但它们都不满足时间复杂度为O(N)且空间复杂度为O(1).
 * [真正]满足时间复杂度为O(N)且空间复杂度为O(1)的算法是不存在的,但是我们可以退而求其次:
 * 利用给定数组中的空间来存储一些状态. 也就是说,如果题目给定的数组是不可修改的,那么就不存在
 * 满足时空复杂度要求的算法;但如果我们可以修改给定的数组,那么是存在满足要求的算法的.
 * 方法一:哈希表
 * 对于[前言]中提到的第一种做法:
 * |我们可以将数组所有的数放入哈希表,随后从1开始依次枚举正整数,并判断其是否在哈希表中.
 * 仔细想想,我们为什么要使用哈希表?这是因为哈希表是一个可以支持快速查找的数据结构:给定
 * 一个元素,我们可以在O(1)的时间查找该元素是否在哈希表中.因此,我们可以考虑将给定的数组
 * 设计成哈希表的[替代产品].
 * 实际上,对于一个长度为N的数组,其中没有出现的最小正整数只能在[1,N+1]中.这是因为如果
 * [1,N]都出现了,那么答案是N+1,否则答案是[1,N]中没有出现的最小正整数.这样一来,我们将
 * 所有在[1,N]范围内的数放入哈希表,也可以得到最终的答案.而给定的数组恰好长度为N,这让
 * 我们有了一种将数组设计成哈希表的思路:
 * ///////////////////////////////////////////////////////////
 * 我们对数组进行遍历,对于遍历到的数x,如果它在[1,N]的范围内,那么就将数组中的第x-1个位置(注意:数组下标从0开始)
 * 打上[标记]. 在遍历结束之后,如果所有的位置都被打上了标记,那么答案是N+1,否则答案是最小的没有打上标记的位置+1
 * 那么如何设计这个[标记]呢?由于数组中的数没有任何限制,因此这并不是一件容易的事情.但我们可以继续利用上面
 * 的提到的性质:由于我们只在意[1,N]中的数,因此我们可以先对数组进行遍历,把不在[1,N]范围内的数修改成任意一个
 * 大于N的数(例如N+1).这样一来,数组中的所有数就都是正数了,因此我们就可以将[标记]表示为[负号].算法的流程如下:
 * <p>
 * ///////////////////////////////////////////////////////////
 * SHENQIdeSUANFA
 */
public class FirstMissPositive {

    /**
     * refresh
     *
     * @param nums
     * @return
     */
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            //如果数字小于=0,则设定该数字为数字长度+1
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            //获取现数据绝对值
            int num = Math.abs(nums[i]);
            //如果这个数小于或等于n,那么就设定其对应的下标数字为负数
            //如现在num为1,则设置数组中第一个数字为负数
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
            //if(num>n)则没有理由进行设置
        }
        //因为这样设置了的话,在有数字的地方,就会将数字设定为负数,那么要寻求的[1-nums[n*]]就被记录到下标上
        //但是这里还有一种可能就是数组内的数字已经全都超过了数组的长度比如数组长度6,而里面的数字都是66,67,69...这样的
        //其实如果即使是这样,也没有关系,因为不用标记到66,因为这个下标数据不存在,如果是从66开始的,那么下标1的地方肯定
        //没有设定值,所以这里返回1就对了
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static int firstMissingPositive1(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 1;
        }
        if (len == 1) {
            return nums[0] == 1 ? nums[0] + 1 : 1;
        }
        //进行排序
        Arrays.sort(nums);
        boolean startFromOne = false;
        boolean containsPositive = false;
        Integer breakpoint = null;
        Integer result = null;
        //开始循环,查找断点(不连续)
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > 0 || nums[i + 1] > 0) {
                System.out.println("包含正数");
                containsPositive = true;
                if (nums[i] + 1 == nums[i + 1]) {
                    //是顺序的
                    System.out.println("是顺序的");
                } else {
                    System.out.println("不是顺序的");
                    breakpoint = nums[i] + 1;
                }
            }
            if (nums[i] == 1 || nums[i + 1] == 1) {
                startFromOne = true;
            }
        }
        if (containsPositive) {
            if (breakpoint != null) {
                System.out.println("断点不为null");
                if (startFromOne) {
                    result = breakpoint;
                } else {
                    if (breakpoint > 1) {
                        System.out.println("如果断点大于1,返回1");
                        result = 1;
                    }
                }
            } else {
                System.out.println("如果是null,则说明全都顺序");
                //如果是null,则说明全都顺序
                if (startFromOne) {
                    result = nums[len - 1] + 1;
                } else {
                    return 1;
                }
            }
        } else {
            //不包含正数,则返回1
            System.out.println("不包含正数,则返回1");
            return 1;
        }
        return result.intValue();
    }

    public static void main(String[] args) {

        int missingPositive = firstMissingPositive(new int[]{1, 2, 0});
        int missingPositive1 = firstMissingPositive(new int[]{3, 4, -1, 1});
        int missingPositive2 = firstMissingPositive(new int[]{7, 8, 9, 11, 12});
        int missingPositive3 = firstMissingPositive(new int[]{-1, -2});
        int missingPositive4 = firstMissingPositive(new int[]{1, 0});
        int missingPositive5 = firstMissingPositive(new int[]{2, 3});
        int missingPositive6 = firstMissingPositive(new int[]{1000, -1});
        int missingPositive7 = firstMissingPositive(new int[]{1, 2, 3, 4, 5, 6});
        int missingPositive8 = firstMissingPositive(new int[]{0, 1, 2, 3, 4, 5});
        System.out.println(missingPositive);
        System.out.println(missingPositive1);
        System.out.println(missingPositive2);
        System.out.println(missingPositive3);
        System.out.println(missingPositive4);
        System.out.println(missingPositive5);
        System.out.println(missingPositive6);
        System.out.println(missingPositive7);
        System.out.println(missingPositive8);

        //使用temp形式
        int missingTempPositive = firstMissingPositiveTemp(new int[]{1, 2, 0});
        int missingTempPositive1 = firstMissingPositiveTemp(new int[]{3, 4, -1, 1});
        int missingTempPositive2 = firstMissingPositiveTemp(new int[]{7, 8, 9, 11, 12});
        int missingTempPositive3 = firstMissingPositiveTemp(new int[]{-1, -2});
        int missingTempPositive4 = firstMissingPositiveTemp(new int[]{1, 0});
        int missingTempPositive5 = firstMissingPositiveTemp(new int[]{2, 3});
        int missingTempPositive6 = firstMissingPositiveTemp(new int[]{1000, -1});
        int missingTempPositive7 = firstMissingPositiveTemp(new int[]{1, 2, 3, 4, 5, 6});
        int missingTempPositive8 = firstMissingPositiveTemp(new int[]{0, 1, 2, 3, 4, 5});
        System.out.println(missingTempPositive);
        System.out.println(missingTempPositive1);
        System.out.println(missingTempPositive2);
        System.out.println(missingTempPositive3);
        System.out.println(missingTempPositive4);
        System.out.println(missingTempPositive5);
        System.out.println(missingTempPositive6);
        System.out.println(missingTempPositive7);
        System.out.println(missingTempPositive8);

        //使用map形式
        int missingMapPositive = firstMissingPositiveMap(new int[]{1, 2, 0});
        int missingMapPositive1 = firstMissingPositiveMap(new int[]{3, 4, -1, 1});
        int missingMapPositive2 = firstMissingPositiveMap(new int[]{7, 8, 9, 11, 12});
        int missingMapPositive3 = firstMissingPositiveMap(new int[]{-1, -2});
        int missingMapPositive4 = firstMissingPositiveMap(new int[]{1, 0});
        int missingMapPositive5 = firstMissingPositiveMap(new int[]{2, 3});
        int missingMapPositive6 = firstMissingPositiveMap(new int[]{1000, -1});
        int missingMapPositive7 = firstMissingPositiveMap(new int[]{1, 2, 3, 4, 5, 6});
        int missingMapPositive8 = firstMissingPositiveMap(new int[]{0, 1, 2, 3, 4, 5});
        System.out.println(missingMapPositive);
        System.out.println(missingMapPositive1);
        System.out.println(missingMapPositive2);
        System.out.println(missingMapPositive3);
        System.out.println(missingMapPositive4);
        System.out.println(missingMapPositive5);
        System.out.println(missingMapPositive6);
        System.out.println(missingMapPositive7);
        System.out.println(missingMapPositive8);
    }

    /**
     * 方法二:置换
     * 除了打标记以外,我们还可以使用置换的方法,将给定的数组[恢复]成下面的形式:
     * |如果数组中包含x∈[1,N],那么恢复后,数组的第x-1个元素为x.
     * 在恢复后,数组应当有[1,2,...,N]的形式,但其中有若干个位置上的数是错误的,
     * 每一个错误的位置就代表了一个缺失的正数.以题目中的示例二[3,4,-1,1]为例,
     * 恢复后的数组应当为[1,-1,3,4],我们就可以知道缺失的数为2.
     * 那我们如何将数组进行恢复呢?我们可以对数组进行一次遍历,对于遍历的数x=nums[i],
     * 如果x属于[1,N],我们就知道x应当出现在数组中的x-1的位置,因此交换nums[i]和nums[x-1].
     * 这样x就出现在了正确的位置(即数字1放到下标0处,以此类推).
     * 在完成交换后,新的nums[i]可能还在[1,N]的范围内,我们需要继续进行交换操作,直到x!∈[1,N].
     * 注意到上面的方法可能会陷入死循环.如果nums[i]恰好与nums[x-1]相等,那么就会无限交换下去.
     * 此时我们有nums[i]=x=nums[x-1],说明x已经出现在了正确的位置.因此我们可以跳出循环,
     * 开始遍历下一个数.
     * 由于每次的交换操作都会使得某一个数交换到正确的位置,因此交换的次数最多为N,整个方法的时间
     * 复杂度为O(N).
     */
    public static int firstMissingPositiveTemp(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    /**
     * 使用map查找第一个没出现在数组nums中的正数
     *
     * @param nums
     * @return
     */
    public static int firstMissingPositiveMap(int[] nums) {
        //创建一个map集合
        Map<Integer, Integer> data = new HashMap<>();
        //从下标0开始,数据中放入数组[index]为key,也就是按下标顺序放入,数据是index(其实可以是其它的)
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                data.put(nums[index], index);
            }
        }
        //遍历该map,通过get(index)从1开始获取,如果获取到的是null,则没有1,则返回1
        //所以当使用负数时,这里的下标会直接掠过去
        for (int index = 1; index <= nums.length + 1; index++) {
            if (data.get(index) == null) {
                return index;
            }
        }
        return nums.length + 1;
    }
}
