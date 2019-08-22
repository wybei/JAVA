
import java.util.*;

public class Main_2 {

    static ArrayList<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int N = cin.nextInt();
        int M = cin.nextInt();
        List<Integer> list = new ArrayList<>();
        //当n>m时，其实大于部分是不可能取到的
        int min = N < M ? N : M;

        printList(min, M, 0, 1, list);
        //按照字典序排列
        Collections.reverse(res);
        for (int i = 0; i < res.size(); i++)
            print(res.get(i));

    }

    private static void printList(int N, int M, int m, int n, List<Integer> list) {

        if (m == M) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            result.addAll(list);
            res.add(result);
            return;
        }

        if (n > N || m > M) {
            return;
        }
        //不放入
        printList(N, M, m, n + 1, list);
        //放入
        list.add(Integer.valueOf(n));
        printList(N, M, m + n, n + 1, list);
        //回溯
        list.remove(Integer.valueOf(n));
    }

    private static void print(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}