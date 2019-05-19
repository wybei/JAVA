package com.wyb.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] {7,4,5,9,8,2,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectSort(int[] arr){
        //遍历所有数
        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            //把当前数字和后一个数字依次比较，并记录下最小数下标
            for (int j = i+1; j <arr.length ; j++) {
                //如果后面比较的数比记录的最小的数小
                if (arr[j]<arr[minIndex]){
                    //记录后一个数下标
                    minIndex=j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致,说明下标为minIndex的数比当前遍历的数更小。
            if (i!=minIndex){
                int tmp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=tmp;
            }
        }
    }
}
