import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        int k = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(k>intervals[i][0])
            {
                if(k>intervals[i][1])
                {
                    k = intervals[i][1];
                }
                res++;
            }
            else{
                if(k<intervals[i][1])
                {
                    k = intervals[i][1];
                }
            }
        }
        return res;

    }
}