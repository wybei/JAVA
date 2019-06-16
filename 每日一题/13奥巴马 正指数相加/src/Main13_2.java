import java.util.Scanner;

public class Main13_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String a=sc.nextLine();
            String b=sc.nextLine();
            System.out.println(AddLongInteger(a,b));
        }
    }
    private static String AddLongInteger(String addend,String augend){
        char[] charsA=new StringBuffer(addend).reverse().toString().toCharArray();
        char[] charsB=new StringBuffer(augend).reverse().toString().toCharArray();
        int maxLength=charsA.length>charsB.length?charsA.length:charsB.length;
        int[] result=new int[maxLength+1];
        for (int i = 0; i <maxLength ; i++) {
            int temp=result[i];
            if (i<charsA.length){
                temp+=charsA[i]-'0';
            }
            if (i<charsB.length){
                temp+=charsB[i]-'0';
            }
            if (temp>=10){
                temp=temp-10;
                result[i+1]=1;
            }
            result[i]=temp;
        }
        StringBuffer sb=new StringBuffer();
        int head=result.length-1;
        if (result[result.length-1]==0){
            head=result.length-2;
        }
        for (int i = head; i >=0 ; i--) {
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
