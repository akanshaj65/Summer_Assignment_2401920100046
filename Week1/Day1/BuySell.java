public class BuySell{
     public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int mp=0;
        for(int i=0;i<prices.length;i++){
            if(bp>prices[i]){
                bp=prices[i];
            }
            else{
                int profit=prices[i]-bp;
                mp=Math.max(mp,profit);
            }
        }
        return mp;
    }
}