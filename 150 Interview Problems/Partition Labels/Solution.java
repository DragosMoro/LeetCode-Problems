import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] input = s.toCharArray();
        int[] ending = new int[26];
        int end=0;
        int size = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<input.length;i++)
        {
            ending[input[i]-'a'] = i;
        }
        for(int i=0;i<input.length;i++)
        {
            end = Math.max(end, ending[input[i]-'a']);
            size++;
            if(i == end)
            {
                res.add(size);
                size = 0;
            }
        }
        return res;
    }
}