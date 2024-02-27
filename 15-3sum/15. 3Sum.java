class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                int sum = nums[i]+nums[right]+nums[left];
                if(sum<0)
                {
                    left++;
                }
                else if(sum>0)
                {
                    right--;
                }
                else{
                    List<Integer> triple = Arrays.asList(nums[i], nums[right], nums[left]);
                    res.add(triple);
                    left++;
                    right--;
                    while(left<right && nums[left] ==nums[left-1])
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