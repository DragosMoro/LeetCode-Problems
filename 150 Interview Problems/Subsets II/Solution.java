import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(nums,list, new ArrayList<>(), 0);
    return list;
}

private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> list, int index){
    res.add(new ArrayList<>(list));
    for(int i=index;i<nums.length;i++)
    {
        //asta poate fi putin tricky, dar aici la apelarea recursiva la adaugarea initiala se modifica si index, deci sunt egale. Astfel, doar la adaugari ulterioare camd se da remove intra acest if
        if(index<i && nums[i] == nums[i-1])
        {
            continue;
        }
        else{
            list.add(nums[i]);
            backtrack(nums, res, list, i+1);
            list.remove(list.size()-1);
        }
    }
} 
}