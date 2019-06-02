import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String str1="";
            for (char ch:str.toCharArray()) {
                if (ch>='0'&&ch<='9'){
                    str1+=ch;
                }else {
                    str1+="a";
                }
            }
            String[] strs=str1.split("a");
            int len=0;
            for (int i = 0; i <strs.length ; i++) {
                len=strs[i].length()>len?strs[i].length():len;
            }
            for (int i = 0; i <strs.length ; i++) {
                if (strs[i].length()==len){
                    System.out.print(strs[i]);
                }
            }
        }
    }
}
