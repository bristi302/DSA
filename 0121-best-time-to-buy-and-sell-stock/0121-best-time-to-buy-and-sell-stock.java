class Solution {
    public int maxProfit(int[] price) {
        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int currProfit = 0;
        int maxProfit = 0;
        for(int i = 0; i<= n-1; i++){
            if(buyPrice<price[i]){
                currProfit = price[i]-buyPrice;
                maxProfit = Math.max(currProfit,maxProfit);
            }else{
                 buyPrice = price[i];
            }
        }
         
         return maxProfit;

    }
}