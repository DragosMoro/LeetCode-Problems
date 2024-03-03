class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int val = Math.min(height[left], height[right]) * (right - left);
            if(val>max)
            {
                max=val;
            }
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                if (height[left + 1] < height[right - 1]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return max;
    }

}