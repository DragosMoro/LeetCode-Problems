class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right] >0)
                {
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] <0)
                {
                    left++;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }
            }
        }
        for(List<Integer>lista:set)
        {
            res.add(lista);
        }
        return res;
    }
}