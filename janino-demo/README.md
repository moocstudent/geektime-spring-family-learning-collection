janino运行时编译
web->janino->cook
[十大经典排序算法](https://www.runoob.com/w3cnote/ten-sorting-algorithm.html)
<br>
选择排序: main()方法不在使用见下面的选择排序
```
public static void main(){
     //数组1
     int[] arr = {11,22,3,34,15,9,86,7,7,55,475,8,49};
     int countISum = 0;
     int countJSum = 0;
     String countJOnceStr = "";
     //选择排序
     for(int i=0;i<arr.length-1;i++){
        int countJOnce = 0;
        int min = i;
        for(int j=i+1;j<arr.length;j++){
          int temp = arr[i];
          if(arr[min] > arr[j]){
              min = j;
          }
          countJSum ++;
          countJOnce ++;
          countJOnceStr += countJOnce+" ";
         
        }
        if(i != min){
           int tmp = arr[i];
           arr[i] = arr[min];
           arr[min] = tmp;
        }
        countISum ++;

    }
    //输出排序后
    for(int little : arr){
        System.out.print(little+" ");
    }
  
    System.out.println();
    System.out.println("外层i循环共:"+countISum +"次");
    System.out.println("内层j循环每次:"+countJOnceStr +"次");
    System.out.println("内层j循环共:"+countJSum +"次");

}

main();
```

选择排序:
```java
public static int[] sortArr(int[] arr){

     int countISum = 0;

     int countJSum = 0;

     String countJOnceStr = "";

     //选择排序

     for(int i=0;i<arr.length-1;i++){

        int countJOnce = 0;

        int min = i;

        for(int j=i+1;j<arr.length;j++){

          int temp = arr[i];

          if(arr[min] > arr[j]){

              min = j;

          }

          countJSum ++;

          countJOnce ++;

          countJOnceStr += countJOnce+" ";

         

        }

        if(i != min){

           int tmp = arr[i];

           arr[i] = arr[min];

           arr[min] = tmp;

        }

        countISum ++;



    }

    //输出排序后

    for(int little : arr){

        System.out.print(little+" ");

    }

  

    System.out.println();

    System.out.println("外层i循环共:"+countISum +"次");

    System.out.println("内层j循环每次:"+countJOnceStr +"次");

    System.out.println("内层j循环共:"+countJSum +"次");
    return arr;


}

public static boolean testEquals(int[] arr1,int[] arr2){

    if(arr1.length!=arr2.length){
        return false;
    }
    int arrLenth = arr1.length;
    while(arrLenth != 0){
        if(arr1[arrLenth -1]!=arr2[arrLenth -1]){
            return false;
        }
        arrLenth --;
    }
    return true;
}


```

冒泡排序:
```java
public static int[] sortArr(int[] arr){
     //冒泡排序
     System.out.println("原始arr:"+arrToString(arr));
     //遍历数组,开始下标从1开始
     System.out.println("length:"+arr.length);
     int count = 0;
     for(int i=1;i<arr.length;i++){
         count ++;
         boolean flag = true;
         //内存循环 j 从0开始,遍历长度为每次(i)获取了最大的数后-1
         for(int j=0;j<arr.length-i;j++){
             //如果当前的值大于了其紧挨着的后面的值,进行两两交换
             if(arr[j] > arr[j+1]){
                 int tmp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = tmp;
                 flag = false;
             }
            
         }
        //如果本次没有进入两两比较,即前一个数并不大于后一个那么直接跳过本次循环
         if(flag){
           System.out.println("count:"+count);
           break;
         }
         System.out.println(arrToString(arr));
     }
     return arr;

}

public static String arrToString(int[] arr){
   String result = "";
   for(int i=0;i<arr.length;i++){
      if(i!=arr.length-1){
         result += arr[i]+",";
      }else{
         result += arr[i];
      }
   }
   return result;

}
```