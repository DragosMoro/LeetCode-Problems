class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    
        int max = 0;
        for(int pile: piles)
        {
            if(max<pile)
            {
                max = pile;
            }
        }
        int left = 0;
        int right = max;
        int result = right;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int res = 0;
            for(int pile:piles)
            {
                double r = (double) pile /mid;
                res += Math.ceil(r);
            }
            if(res<=h)
            {
                result = Math.min(mid, result);
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }

        }
        return result;
    }
}