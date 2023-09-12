import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        commonApproach(nums, res, list, 0);
        return res;

    }
    private void helper(int[] nums, List<List<Integer>> res, List<Integer> list, int index)
    {
        if(index>=nums.length)
        {
            res.add(new ArrayList<>(list));
        }
        else{
            list.add(nums[index]);
            helper(nums, res, list, index+1);
            list.remove(list.get(list.size()-1));
            helper(nums, res, list, index+1);
        }   
      
    }
    private void commonApproach(int[] nums, List<List<Integer>> res, List<Integer> list, int index)
    {
        res.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++)
        {
            list.add(nums[i]);
            commonApproach(nums, res, list, i+1);
            list.remove(list.size()-1);
        }
    }
}