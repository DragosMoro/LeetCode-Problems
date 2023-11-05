class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        List<Integer> res = new ArrayList<>();
        if(n ==0)
        {
            for(int j = 0;j<=m;j++)
            {
                res.add(matrix[0][j]);
            }
            return res;
        }
        if(m == 0)
        {
            for(int j = 0;j<=n;j++)
            {
                res.add(matrix[j][0]);
            }
            return res;
        }
        int ni = 0;
        int mj = 0;
        while(ni!=matrix.length-1 && mj!=matrix[0].length-1)
        {
            for(int j=0;j<=m;j++)
            {
                if(matrix[ni][j] !=101)
                {
                    res.add(matrix[ni][j]);
                    matrix[ni][j] = 101;
                }
            
            }
            for(int i=0;i<=n;i++)
            {
                if(matrix[i][m] !=101)
                {
                    res.add(matrix[i][m]);
                    matrix[i][m] = 101;
                }
                
            }
            for(int j=m;j>=mj;j--)
            {
                if(matrix[n][j] !=101)
                {
                    res.add(matrix[n][j]);
                    matrix[n][j] = 101;
                }
            
            }
            for(int i =n;i>=ni;i--)
            {
                if(matrix[i][mj] !=101)
                {
                    res.add(matrix[i][mj]);
                    matrix[i][mj] = 101;
                }
            }
            n--;
            m--;
            mj++;
            ni++;
        }
    return res;

    }
}