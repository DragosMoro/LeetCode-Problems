class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return calculate(nums, goal) - calculate(nums, goal-1);
    }
    public int calculate(int[] nums, int goal)
    {
        int left=0;
        int sum=0;
        int res=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>goal && right>=left)
            {
                sum -=nums[left];
                left++;
            }
            res +=right-left+1;
        }
        return res;
    }
}