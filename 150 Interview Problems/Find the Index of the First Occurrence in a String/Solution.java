import java.util.Objects;

class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        int pos = 0;
        int i=0;
       
        while(i<haystack.length())
        {
            if(pos<needle.length() && Objects.equals(haystack.charAt(i), needle.charAt(pos)))
            {
                pos++;
                i++;
            }
            
            else{
                if(pos==0)
                {
                    i=i+1;
                }
                else
                {
                i=i-pos+1;
                pos = 0;
                }
            }
             if(Objects.equals(pos, needle.length()))
            {
                index = i-pos;
                return index;
            }

        }
        return index;
    }
}