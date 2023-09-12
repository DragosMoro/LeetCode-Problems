import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, result, list);
        return result;
    }
    private void helper(int[] nums, int target, int index, List<List<Integer>> result, List<Integer> list)
    {
        if(target<0)
        {
            return;
        }
        else if(target==0)
        {
            result.add(new ArrayList<>(list));
        }
        else{
            for(int i=index;i<nums.length;i++)
            {
                if(i>index && nums[i] == nums[i-1]) continue;
                list.add(nums[i]);
                helper(nums, target-nums[i],i+1,result,list);
                list.remove(list.size()-1);
            }
        }
    }
}