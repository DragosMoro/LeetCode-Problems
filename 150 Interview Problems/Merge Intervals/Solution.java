import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        {
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] prev = new int[2];
        prev = intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(prev[1]>=intervals[i][0])
            {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            }
            else{
                result.add(prev);
                prev = intervals[i];
            }
        }
        result.add(prev);
        
        int [][] ret = new int[result.size()][2];
        int c = 0;
        for(int[] res: result)
        {
            ret[c] = res;
            c++;
        }
        return ret;

    }
}