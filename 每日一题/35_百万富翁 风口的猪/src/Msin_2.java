
public class Msin_2 {

    private int calculateMax(int[] prices) {
        int fistBuy=Integer.MAX_VALUE;
        int afFistSell=0;
        int afSecBuy=Integer.MIN_VALUE;
        int afSecSell=0;
        for (int price:prices) {
            fistBuy=Math.min(fistBuy,price);
            afFistSell=Math.max(afFistSell,price-fistBuy);
            afSecBuy=Math.max(afFistSell-price,afSecBuy);
            afSecSell=Math.max(afSecSell,afSecBuy+price);
        }
        return afSecSell;
    }
}
