class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> apps = new HashSet<>();
        for(int num : nums)
        {
            if(apps.contains(num))
            {
                return true;
            }
            else{
                    apps.add(num);
                }
        }
        return false;
    }
}