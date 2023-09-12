import java.util.Arrays;

class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int res[] = new int[3];
        for(int i=0;i<triplets.length;i++)
        {
            if(triplets[i][0] <=target[0] && triplets[i][1] <=target[1] && triplets[i][2] <=target[2])
            {
                for(int j=0;j<3;j++)
                {
                    if(Math.max(triplets[i][j], res[j]) <=target[j])
                    {
                        res[j] = Math.max(triplets[i][j], res[j]);
                    }
                }
            }
        }
        if(Arrays.equals(res, target))
        {
            return true;
        }
        return false;
    }
}