class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!map.containsKey(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}