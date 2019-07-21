package com.wyb.cases;

import com.wyb.Case;
import com.wyb.annotations.Benchmark;
import com.wyb.annotations.Measurement;

import java.util.Arrays;
import java.util.Random;

/*
快排与归并排序的差别
自己实现的归并排序和Arrays.sort对比
 */
@Measurement(iterations = 20,groups = 5)
public class SortCase implements Case {
    private static void quickSort(int arr[],int start,int end){
        if (start<end){
            //把第0个数作为标准数
            int stared=arr[start];
            //记录需要排序的下标
            int low=start;
            int high=end;
            //循环找比标准数大的数和比标准数小的数
            while (low<high){
                //右边的数字比标准数大
                while (low<high&&stared<=arr[high]){
                    high--;
                }
                //使用右边的数替换左边的数
                arr[low]=arr[high];
                //左边的数比标准数小
                while (low<high&&stared>=arr[low]){
                    low++;
                }
                arr[high]=arr[low];
            }
            //把标准数赋给低所在的位置的元素
            arr[low]=stared;
            //处理所有小的数字
            quickSort(arr,start,low);
            //处理所有大的数字
            quickSort(arr,low+1,end);
        }
    }
    //归并
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

    @Benchmark
    public void  testQuickSort(){
        int[] arr=new int[100000];
        Random random=new Random(19970901);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(100000);
        }
        quickSort(arr,0,arr.length-1);
    }
    @Benchmark
    public void  testMergeSort(){
        int[] arr=new int[100000];
        Random random=new Random(19970901);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(100000);
        }
        mergeSort(arr,0,arr.length-1);
    }
    @Benchmark
    public void  testArraysSort(){
        int[] arr=new int[100000];
        Random random=new Random(19970901);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(100000);
        }
        Arrays.sort(arr);
    }
}
