class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean isActivated = false;
        int comparator = 0;
        int pos = 0;
        if(nums.length == 1)
        {
            return true;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(i>1 && i<nums.length-1 && nums[i-2]>nums[i] && nums[i-1]>nums[i+1])
            {
                return false;
            }
            if(nums[i-1]>nums[i])
            {
                if(isActivated)
                {
                    return false;

                }
                isActivated = true;
            }
        }
        return true;
    }
}