class Solution {
    public int islandPerimeter(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    int add = 4;
                    if(i-1>=0 && grid[i-1][j] == 1)
                    {
                        add--;
                    }
                    if(j-1>=0 && grid[i][j-1] == 1)
                    {
                        add--;
                    }
                    if(j+1<grid[i].length && grid[i][j+1] == 1)
                    {
                        add--;
                    }
                    if(i+1<grid.length && grid[i+1][j] == 1)
                    {
                        add--;
                    }
                    result +=add;
                }
             
            }
        }
        return result;
        
    }
}