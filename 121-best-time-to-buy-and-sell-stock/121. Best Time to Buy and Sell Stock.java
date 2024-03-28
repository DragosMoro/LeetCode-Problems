class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
        {
            return 0;
        }
        int left = 0;
        int right = 1;
        int max = 0;
        int current = 0;
        while(right<prices.length)
        {
            current = prices[right] - prices[left];
            if(max<current)
            {
                max = current;
            }
            while(prices[left]>prices[right] && left<right)
            {
                left++;
            }
            right++;
        }
        return max;
    }
}