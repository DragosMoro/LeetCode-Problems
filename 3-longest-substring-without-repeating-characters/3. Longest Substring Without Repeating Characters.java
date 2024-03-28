class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                right++;
                max = Math.max(max, charSet.size());
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
}
