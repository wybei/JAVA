
public class ReserveInstence{
        public static void reserve(char[] arr, int begin, int end) {
            while(begin < end) {
                char temp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = temp;
                begin++;
                end--;
            }
        }
        public static String reserveWords(String str) {
            char[] arr = str.toCharArray();
            reserve(arr, 0, arr.length - 1);
            int begin = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == ' ') {
                    reserve(arr, begin, i - 1);
                    begin = i + 1;
                }
            }

            return new String(arr);
        }

    public static void main(String[] args) {
        String str="i love china";
        System.out.println(reserveWords(str));
    }
}