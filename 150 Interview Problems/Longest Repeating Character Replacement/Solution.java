class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        char[] letters = new char[26];
        while(right<s.length())
        {
            letters[s.charAt(right) - 'A']++;
            if(right - left + 1 - max(letters) > k)
            {
                letters[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
    private int max(char[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}