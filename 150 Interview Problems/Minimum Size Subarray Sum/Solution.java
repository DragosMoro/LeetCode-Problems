class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int min= Integer.MAX_VALUE;
        int sum = 0;
        while(right<nums.length)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                sum-=nums[left];
                min = Math.min(min, right-left+1);
                left++;
            }
            right++;
        }
        if(min == Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;

        
    }
}