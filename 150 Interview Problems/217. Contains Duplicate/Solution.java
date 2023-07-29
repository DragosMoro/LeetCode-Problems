class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> apps = new HashMap<>();
        for(int num : nums)
        {
            if(apps.containsKey(num))
            {
                return true;
            }
            else{
                    apps.put(num, 1);
                }
        }
        return false;
    }
}