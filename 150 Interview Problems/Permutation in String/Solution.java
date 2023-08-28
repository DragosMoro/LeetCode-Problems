import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = 0;
        char[] chars = new char[26];
        char[] s2Chars = new char[26];
        for(int i=0;i<s1.length();i++)
        {
            chars[s1.charAt(i)-'a']++; 
        }
        while(right<s2.length())
        {
            s2Chars[s2.charAt(right)-'a']++;
            if(right-left+1 == s1.length())
            {
                if(Arrays.equals(s2Chars, chars))
                {
                    return true;
                }
                s2Chars[s2.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return false;
    }
}