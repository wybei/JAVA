import java.util.Scanner;

public class Main10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(countWays(x, y));
        }
    }

    private static int countWays(int x, int y) {
        if (x <= 0 || y <= 0) {
            return 0;
        }
        if (x == 1 || y == 1) {
            return 1;
        }
        int table[][] = new int[x + 1][y + 1];
        table[0][0] = 0;
        for (int i = 1; i < y; i++) {
            table[1][i] = 1;
        }
        for (int i = 1; i < x; i++) {
            table[i][1] = 1;
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }
        return countWays(x - 1, y) + countWays(x, y - 1);
    }
}

