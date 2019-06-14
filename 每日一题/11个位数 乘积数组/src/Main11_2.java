import java.util.ArrayList;
public class Main11_2 {
    public int[] multiply(int[] A) {
/*        int len=A.length;
        if (A==null||len==0){
            return null;
        }
        int[] B=new int[len];
        for (int i = 0; i <len ; i++) {
            int num=1;
            for (int j = 0; j <len ; j++) {
                if (j!=i){
                    num*=A[j];
                }
            }
            B[i]=num;
        }
        return B;
    }*/
        int len=A.length;
        if (A==null){
            return null;
        }
        int[] B=new int[len];
        if (len!=0){
            B[0]=1;
            for (int i = 1; i <len ; i++) {
                B[i]=B[i-1]*A[i-1];
            }
            int temp=1;
            for (int i = A.length-2; i >=0 ; i--) {
                temp*=A[i+1];
                B[i]*=temp;
            }
        }
        return B;
    }
}
