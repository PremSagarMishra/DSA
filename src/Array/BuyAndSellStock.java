package Array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int minvalue=prices[0];
        int maxprofit=0;

        for(int price:prices){
            minvalue=Math.min(price,minvalue);
            maxprofit=Math.max(maxprofit,price-minvalue);
        }

        return maxprofit;
    }
}
