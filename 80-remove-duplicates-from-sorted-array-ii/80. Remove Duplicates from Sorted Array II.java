class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
        {
            
        } 
            

        int j = 2; // Start from the third element.
        for (int i = 2; i < nums.length; i++) {
            // If the current element is not the same as the element at j-2, it's a valid element to keep.
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j; // The array is now [valid elements, ..., original elements], with `j` valid elements at the start.
    
    }
}