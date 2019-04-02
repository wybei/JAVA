public class Test1 {
    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c ==' ') {
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("We are happy");
        System.out.println(replaceSpace(str));
    }
}
