class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int j=1,i=0;
        while(j<prices.length){
            if(prices[j]<prices[i]){
                i=j;
            }
            if(prices[j]>prices[i]){
                maxP=Math.max(maxP,prices[j]-prices[i]);
            }
            j++;
        }
        return maxP;
    }
}