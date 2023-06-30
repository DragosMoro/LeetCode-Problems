import java.util.Objects;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder finalStr = new StringBuilder();
        if(Objects.equals(strs.length,1))
        {
            return strs[0];
        }
        if(strs.length>1)
        {
            int len = Math.min(strs[1].length(), strs[0].length());
            for(int j = 0;j<len;j++)
            {
                if(Objects.equals(strs[1].charAt(j), strs[0].charAt(j)))
                {
                    finalStr.append(strs[1].charAt(j));
                }
                else{
                    break;
                }
            }
        }
        
        for(int i=2;i<strs.length;i++)
        {
            int len = Math.min(strs[i].length(), finalStr.length());
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<len;j++)
            {
                if(Objects.equals(strs[i].charAt(j),finalStr.charAt(j)))
                {
                    sb.append(strs[i].charAt(j));
                }
            }
            finalStr = sb;
        }

     return finalStr.toString();
    }
   
}