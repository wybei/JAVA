import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            jiCheck(str.toCharArray());
        }
    }
    public static void jiCheck(char[] arrs){
        int[] result = new int[8];    // 保存二进制序列
        for(int i = 0; i < arrs.length; i++){
            int one = 1;
            int count = 0;    // 保留二进制序列中1的个数
            // 得到其二进制序列
            int index = 7;
            while(index > 0){
                result[index] = ((arrs[i]& one) == 0) ? 0 : 1;
                if(result[index] == 1){
                    count++;
                }

                one <<= 1;
                index--;
            }
            // 偶数个1，高位为1；奇数个1，高位为0
            result[0] = (count % 2 == 1) ? 0 : 1;
            // 输出
            for(int k = 0; k < 8; k++){
                System.out.print(result[k]);
            }
            System.out.println();
        }
    }
}

