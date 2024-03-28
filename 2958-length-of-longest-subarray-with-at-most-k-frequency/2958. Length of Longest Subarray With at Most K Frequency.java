class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int right = 0;
        int len = 0;

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (left < right && map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
                len--;
            }
            len++;
            right++;
            max = Math.max(max, len);
        }
        return max;

    }
}