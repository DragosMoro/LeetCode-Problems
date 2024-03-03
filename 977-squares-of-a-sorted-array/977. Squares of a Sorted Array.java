class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for(int i=0;i<len;i++)
        {
            nums[i] *=nums[i];
        }

        int index = len-1;
        int left = 0;
        int right = len-1;

        while(left<=right)
        {
            if(nums[left]>nums[right])
            {
                res[index] = nums[left];
                left++;
            }
            else{
                res[index] = nums[right];
                right--;
            }
            index--;
        }
        return res;

        
    }
}