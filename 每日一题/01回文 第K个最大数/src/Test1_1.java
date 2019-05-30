import java.util.*;

public class Test1_1 {
    public int findKth(int[] a, int n, int K) {
        return find(a,0,n-1,K);
    }
    private static int find(int[] a,int low,int high,int k){
        int max=quickSort(a,low,high);
        if (k==max-low+1){
            return a[max];
        }else if (k>max-low+1){
            return find(a,max+1,high,k-(max-low+1));
        }else {
            return find(a,low,max-1,k);
        }
    }
    private static int quickSort(int arr[],int low,int high){
            int started=arr[low];
            while (low<high){
                while (low<high&&arr[high]>=started){
                    high--;
                }
                arr[low]=arr[high];
                while (low<high&&arr[low]<=started){
                    low++;
                }
                arr[high]=arr[low];
            }
            arr[low]=started;
            return low;
    }
}

