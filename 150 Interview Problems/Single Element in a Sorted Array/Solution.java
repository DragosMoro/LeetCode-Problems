class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right= nums.length-1;
        int mid = 0;
        if(nums.length == 1)
        {
            return nums[0];
        }
        while(left<=right)
        {
            mid = left+(right-left)/2;
            
            if((mid-1<0 || nums[mid]-nums[mid-1] != 0) && (mid+1 == nums.length || nums[mid]-nums[mid+1] !=0))
            {
                return nums[mid];
            }
            int leftSize = nums[mid - 1] == nums[mid] ? mid-1:mid;
            if(leftSize%2 == 0)
            {
           
}