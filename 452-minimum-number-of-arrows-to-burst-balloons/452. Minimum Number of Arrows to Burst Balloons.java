class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int len = points.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<points.length-1;i++)
        {
            min = Math.min(min, points[i][1]);
            if(points[i][1]>=points[i+1][0] && points[i+1][0]<=min)
            {
                len--;
            }
            else{
                min=points[i+1][1];
            }
        }
        return len;
    }
}