class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(left<=right)
        {
            mid =left+(right-left)/2;
            if((mid-1<0 || nums[mid-1] < nums[mid]) && (mid+1==nums.length || nums[mid+1] < nums[mid]))
            {
                return mid;
            } 
            if(mid>0 && mid<nums.length && nums[mid-1] > nums[mid] && nums[mid]>nums[mid+1])
            {
                right = mid-1;
                            
            }
            else{
              left=mid+1;

            }
        }
        return right;
    }
}