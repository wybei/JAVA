package com.bittech;

public class Solution {
    public static boolean Find(int target, int [][] array) {
        int row=0;
        int len=array[0].length-1;
        while((len>=0)&&(row<array.length)){
            if(array[row][len]>target){
                len--;
            }else if(array[row][len]<target){
                row++;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };
        System.out.println(Find(7,arr));
    }
}
