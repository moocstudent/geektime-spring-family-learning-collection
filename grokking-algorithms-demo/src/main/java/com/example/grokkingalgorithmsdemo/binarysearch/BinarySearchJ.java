package com.example.grokkingalgorithmsdemo.binarysearch;

/**
 * @Author: zhangQi
 * @Date: 2021-03-03 15:12
 */
public class BinarySearchJ {

    private static Integer binarySearch(int[] list,int item){
        int low = 0;
        int high = list.length-1;
        //当两个下标还没有挨在一起或刚刚挨在一起时
        while(low<=high){
            //获取中间数
            int mid = (low+high)/2;
            //猜测列表中的这个中间数是否是要检索的数据
            int guess = list[mid];
            //如果是,直接返回
            if(guess==item){
                return mid;
            }
            //如果猜测的数字是大于传入的要检索的数字时,
            //此时二分查找的策略是,既然中间数不是,那么就将包括中间数的所有大的数字都排除掉
            if(guess>item){
                high=mid-1;
            }else{
                //否则如果猜测的数小于传入的要检索的数字时,
                //此时二分查找的策略则为,既然中间数不是,并且真正的数字大于现在猜测的中间数,
                //那么肯定要提高现在的中间数,即将最小部分的数字提升到现中间数+1
                low = mid+1;
            }
        }
        return null;
    }

    /**
     * 这些都建立在数据在排好序的情况下,如果不是排好序的情况,需要先进行排序
     * 才可以执行二分查找
     * @param args
     */
    public static void main(String[] args) {
        int[] myList = {1,3,5,7,9};

        System.out.println(binarySearch(myList,3)); //1
        System.out.println(binarySearch(myList,-1));//null
    }
}
