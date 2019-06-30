import java.lang.reflect.Array;
import java.util.*;

public class Main16_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int groups=sc.nextInt();
            while (groups-->0){
                int n=sc.nextInt();
                int k=sc.nextInt();
                List<Integer> list=new ArrayList<>();
                for (int i = 0; i <2*n ; i++) {
                    list.add(sc.nextInt());
                }
                for (int i = 0; i <k ; i++) {
                    list=new Main16_1().shuffle(list,n);
                }
                for (int i = 0; i <list.size() ; i++) {
                    System.out.print(list.get(i));
                    if (i!=list.size()-1){
                            System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
    private static List<Integer> shuffle(List<Integer> list,int n){
        List<Integer> leftCards=list.subList(0,n);
        List<Integer> rightCards=list.subList(n,2*n);
        List<Integer> cards=new ArrayList<>();
        int lestIndex=0;
        int rightIndex=0;
        for (int i = 0; i <n ; i++) {
            cards.add(rightCards.get(n-i-1));
            cards.add(leftCards.get(n-1-i));
        }
       Collections.reverse(cards);
        return cards;
    }
}
