package com.wyb.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,6,1,5,8,4,2,9,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int flag=1;//定义flag=1，当它不变时，证明数组已经有序。
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                    flag=0;
                }
            }
            if (flag==1){
                break;
            }
        }
    }
}
