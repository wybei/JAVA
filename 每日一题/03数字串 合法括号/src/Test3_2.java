import java.util.Stack;

public class Test3_2 {
    public static boolean chkParenthesis(String A, int n){
        Stack<Character> stack=new Stack<>();
        char[] ch=A.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]=='('){
                stack.push(ch[i]);
            }else if (!stack.empty()&&ch[i]==')'){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();
    }
}
