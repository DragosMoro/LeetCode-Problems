class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long result = 0;
        int leftBound = -1;
        int minIndex = -1;
        int maxIndex = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>maxK || nums[i]<minK)
            {
                leftBound = i;
            }
            if(nums[i] == minK)
            {
                minIndex = i;
            }
            if(nums[i] == maxK)
            {
                maxIndex = i;
            }
            result += Math.max(0, Math.min(minIndex, maxIndex) -leftBound);
        }
        return result;

    }
}