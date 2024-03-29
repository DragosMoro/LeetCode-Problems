class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
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
                    res.add(list);
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1])
                    {
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1])
                    {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}