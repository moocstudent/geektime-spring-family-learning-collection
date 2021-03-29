package com.example.grokkingalgorithmsdemo.quicksort;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: zhangQi
 * @Date: 2021-03-03 9:45
 * 快速排序的原理
 * 我们再来看快速排序算法(Quicksort),
 * 我们习惯性地把它简称为"快排".快排利用的也是分治思想.
 * 乍看起来,它有点像归并排序,但是思路其实完全不一样.
 * 我们待会会讲两者区别.现在,先看下快排的核心思想.
 * <p>
 * 快排的思想是这样的:如果要排序数组中下标
 * 从p到r之间的一组数据,我们选择p到r之间的任意一个数据作为pivot(分区点)
 * <p>
 * 我们遍历p到r之间的数据,将小于pivot的放到左边,将大于pivot的放到右边,
 * 将pivot放到中间.经过这一步骤之后,数组p到r之间的数据就被分成3个部分,
 * 前面p到q-1之间都是小于pivot的,中间是pivot,后面的q+1到r之间是大于pivot的.
 * <p>
 * [8(p)][10][2][3][6][1][5(pivot)(r)]
 * 分区↓
 * [2(p)][3][1(q-1)][5(q)][6(q+1)][8][10(r)]
 * <p>
 * 根据分治,递归的处理思想,我们可以用递归排序下标从p到q-1之间的数据
 * 和下标从q+1到r之间的数据,直到区间缩小为1,就说明所有的数据都有序了.
 * <p>
 * 如果我们用递推公式来将上面的过程写出来的话,就是这样:
 * 递推公式:
 * quick_sort(p...r) = quick_sort(p...q-1)+quick_sort(q+1...r)
 * 终止条件
 * p>=r
 */
//将递推公式转化成递归代码.跟归并排序一样,我还是用伪代码来实现,当然可以翻译成任何你熟悉的语言.
//        //快速排序,A是数组,n表示数组的大小
//        quick_sort(A,n){
//            quick_sort_c(A,0,n-1)
//        }
//        //快速排序递归函数,p,r为下标
//        quick_sort_c(A,p,r){
//            if p>=r then return
//            //获取分区点
//            q = partition(A,p,r)
//            quick_sort_c(A,p,q-1)
//            quick_sort_c(A,q+1,r)
/**
 * 归并排序中有一个merge()合并函数,我们这里有一个partition()分区函数.
 * partition()分区函数实际上我们前面已经讲过了,就是随机选择一个元素作为pivot
 * (一般情况下,可以选择p到r区间的最后一个元素),然后对A[p...r]分区,
 * 函数返回pivot的下标.
 * 如果我们不考虑空间消耗的话,partition()分区函数可以写得非常简单.我们申请
 * 两个临时数组X和Y,遍历A[p...r],将小于pivot的元素都拷贝到临时数组X,将大于
 * pivot的元素都拷贝到临时数组Y,最后再将数组X和数组Y中数据顺序拷贝到A[p...r]
 */
public class QuickSort {

    public static void main(String[] args) {
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
    }

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            //因为没必要排序,所以直接返回
            return list;
        } else {
            Integer pivot = list.get(0);

            //子列表less为所有比pivot小数字
            List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                    .collect(Collectors.toList());

            List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                    .collect(Collectors.toList());

            return Stream.of(
                    quicksort(less).stream(),
                    Stream.of(pivot),
                    quicksort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }
}
