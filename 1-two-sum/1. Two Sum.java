class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], i);
        }

        int [] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int searched = target-nums[i];
            if(map.containsKey(searched) && map.get(searched)!=i)
            {
                res[0] = i;
                res[1] = map.get(searched);
                return res;
            }
        }
        return res;
    }
}