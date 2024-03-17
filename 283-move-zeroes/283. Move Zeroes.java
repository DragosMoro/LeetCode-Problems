class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) {
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }
}