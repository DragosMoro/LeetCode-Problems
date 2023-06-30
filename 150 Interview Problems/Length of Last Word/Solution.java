class Solution {
    public int lengthOfLastWord(String s) {
        boolean isWord = false;
        int len = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) != ' ')
            {
                if(isWord)
                {
                    len++;
                }
                if(len<1)
                {
                    len++;
                    isWord=true;
                }
 
                if(isWord !=true && len>1)
                {
                    break;
                }

            }
            else{
                isWord = false;
            }
        }
        return len;
    }
}