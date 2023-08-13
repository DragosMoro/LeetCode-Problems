class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        long mid = 0;
        while(left<=right)
        {
            mid = left+(right-left)/2;
            if(mid*mid == num)
            {
                return true;
            }
            else if(mid*mid<num)
            {
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return false;
    }
}