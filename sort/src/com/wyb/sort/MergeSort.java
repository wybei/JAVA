package com.wyb.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4,6,8,10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr,int low,int high){
        int middle=(low+high)>>1;
        if (low<high){
            //处理左边
            mergeSort(arr,low,middle);
            //处理右边
            mergeSort(arr,middle+1,high);
            //归并
            merge(arr,low,middle,high);
        }
    }
    private static void merge(int[] arr,int low,int middle,int high){
        //存储归并后的临时数据
        int[] tmp=new int[high-low+1];
        //记录第一个数组中需要遍历的下标
        int i=low;
        //记录第二个数组中需要遍历的下标
        int j=middle+1;
        //记录在临时数组存放的下标
        int index=0;
        //遍历两个数组，取出小的数字放入临时数组中
        while (i<=middle&&j<=high){
            //第一个数组数据更小
            if (arr[i]<=arr[j]){
                //把小的数放入临时数组中
                tmp[index]=arr[i];
                //下标后移
                i++;
            }else {
                tmp[index]=arr[j];
                j++;
            }
            index++;
        }
        //处理多余数据
        while (j<=high){
            tmp[index++]=arr[j++];
        }
        while (i<=middle){
            tmp[index++]=arr[i++];
        }
        //把临时数组中的数据放入原数组
        for (int k = 0; k <tmp.length ; k++) {
            arr[k+low]=tmp[k];
        }
    }
}
