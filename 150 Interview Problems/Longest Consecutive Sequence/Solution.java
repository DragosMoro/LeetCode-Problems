import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int res = 0; 
        for(int i =0;i<nums.length; i++)
        {
            s.add(nums[i]);
        }
        for(int el: s)
        {
            if(!s.contains(el-1))
            {
                int count = 1;
                int clone= el;
                while(s.contains(clone+1))
                {
                    count++;
                    clone++;
                }
                if(res<count)
                {
                    res=count;
                }
            }
        }
        return res;

    }
}