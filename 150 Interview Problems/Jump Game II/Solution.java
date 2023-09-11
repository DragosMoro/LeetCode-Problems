class Solution {
    public int jump(int[] nums) {
        int currEnd = 0;
        int currFar = 0;
        int res = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            currFar = Math.max(currFar, i+nums[i]);
            if(currEnd == i)
            {
                currEnd = currFar;
                res++;
            }
        }
        return res;
    }
}