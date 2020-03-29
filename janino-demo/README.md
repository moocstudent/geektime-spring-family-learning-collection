janino运行时编译
web->janino->cook

选择排序:
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