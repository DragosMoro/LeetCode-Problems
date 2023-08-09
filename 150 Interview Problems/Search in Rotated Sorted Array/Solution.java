class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid = (left+right)/2;
            if(nums[mid]> nums[right])
            {
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        if(target <=nums[nums.length-1])
        {
            right = nums.length-1;
        }
        else{
            left = 0;
            right = right-1;
        }
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid]< target)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;



    }
}