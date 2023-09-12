import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(candidates, target, 0, result, list);
        return result;
    }
    private void helper(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> list)
    {

        if(target == 0)
        {
            result.add(new ArrayList<>(list));
        }
        else if(target <0)
        {
            return;
        }
        else{
            for(int i = index;i<candidates.length;i++)
            {
                list.add(candidates[i]);
                helper(candidates, target-candidates[i], i, result, list);
                list.remove(list.size()-1);
            }
        }

    }
}