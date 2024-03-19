class Solution {
    public int maxProfit(int[] prices) {
        int sum =0;
        int left=0;
        int right=1;
        while(right<prices.length && left<right)
        {
            
           if(prices[left]>prices[right])
           {
                left = right;
                right++;
           }
           else{
            sum+=prices[right]-prices[left];
            left++;
            right++;
           }
            
        }
        return sum;
    }
}