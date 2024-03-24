class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int freq[] = new int[length];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
            if(freq[nums[i]] >1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}