class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int zeros=0;
        while(i<nums.length-zeros)
        {
            if(nums[i]==0)
            {
                zeros++;
                int j=i;
                while(j<nums.length-1)
                {
                    int el = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = el;
                    j++;
                }
            }
            else{
                i++;
            }
        }
    }
}