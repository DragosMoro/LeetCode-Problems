import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper( res, nums, list);
        return res;
    }
    private void helper(List<List<Integer>> res, int[] nums, List<Integer> list)
    {
        if(list.size() == nums.length)
        {
            res.add(new ArrayList<>(list));
        }
        else{
            for(int i=0;i<nums.length;i++)
            {
                if(!list.contains(nums[i]))
                {
                    list.add(nums[i]);
                    helper(res, nums, list);
                    list.remove(list.get(list.size()-1));
                }
            }
            

        }
    }
}