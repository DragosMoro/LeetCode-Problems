class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right<s.length() && left<=right)
        {
            if (sb.indexOf(String.valueOf(s.charAt(right)))==-1)
            {
                sb.append(s.charAt(right));
                right++;
                max = Math.max(max, sb.length());
            }
            else{
                sb.deleteCharAt(0);
                left++;
            }

        }
        return max;
    }
}