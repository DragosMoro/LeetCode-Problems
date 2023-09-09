import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && newInterval[0]<=intervals[i][1] && newInterval[1]>=intervals[i][0])
        {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(newInterval);
        while(i<intervals.length)
        {
            result.add(intervals[i]);
            i++;
        }
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