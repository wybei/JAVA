public class NumberOf1InBinary {

    //从右向左移:思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
    public static int NumberOf1(int n) {
        int count=0;
        int flag=1;
        while(flag!=0){
            if((n&flag)!=0){
                count++;
            }
            flag=flag<<1;
        }
        return count;
    }

    //最优解
    //思想：把一个整数减去1，再和原整数做与运算，会把整数最右边的一个1变成0。
    //那么一个整数的二进制表示中有多少个1，就可以进行多少次这样的操作。
    public static int NumberOf2(int n){
        int count=0;
        while(n!=0){
            ++count;
            n = (n - 1) & n;
        }
        return count;

    }



    public static void main(String[] args) {
        int n1=NumberOf1(15);
        int n2=NumberOf2(15);
        System.out.println(n1);
        System.out.println(n2);

    }
}
