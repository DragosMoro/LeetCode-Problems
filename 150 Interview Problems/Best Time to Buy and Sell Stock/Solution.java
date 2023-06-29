class Solution {
    public int maxProfit(int[] prices) {
        int leastValue = Integer.MAX_VALUE;
        int overallProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<leastValue)
            {
                leastValue = prices[i];
            }
            if(overallProfit < prices[i]-leastValue)
            {
                overallProfit = prices[i]-leastValue;

            }
        }
        return overallProfit;
    }
}