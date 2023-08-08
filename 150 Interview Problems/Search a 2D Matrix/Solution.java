class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length;
        int j = matrix[0].length;
        int top = 0;
        int bottom = i-1;
        while(top<=bottom)
        {
            int mid = top + (bottom-top)/2;
            if(matrix[mid][j-1]<target)
            {
                top = mid+1;
            }
            else if(matrix[mid][0]>target){
                bottom = mid-1;
            }
            else{
                break;
            }
        }
        if(top>bottom)
        {
            return false;
        }
        int row = (top + bottom)/2;
        int left = 0;
        int right = j-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(matrix[row][mid] == target)
            {
                return true;
            }
            else if(matrix[row][mid]<target)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;

}
}