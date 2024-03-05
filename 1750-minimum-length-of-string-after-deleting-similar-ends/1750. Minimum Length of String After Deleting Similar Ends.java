class Solution {
  public int minimumLength(String s) {
        int left  = 0;
        int right = s.length()-1;
        int res = 0;

        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(leftChar == rightChar) {
                while(left <= right && s.charAt(left) == leftChar) {
                    left++;
                }
                while(left <= right && s.charAt(right) == rightChar) {
                    right--;
                }
            } else {
                break;
            }
        }

        return right - left + 1;
    }
}