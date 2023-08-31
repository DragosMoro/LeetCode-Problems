class Solution {
    public int maxVowels(String s, int k) {
        char[] in = s.toCharArray();
        int vowelsCounter = 0;
        int max = 0;
        int left = 0;
        int right =0;
        while(right<in.length)
        {
            if(isVowel(in[right]))
            {
                vowelsCounter++;
            }
            if(right-left+1 == k)
            {
                max = Math.max(max, vowelsCounter);
                if(isVowel(in[left]))
                {
                    vowelsCounter--;
                }
                left++;
            }
            right++;
        }
        return max;
    }
    private boolean isVowel(char c)
    {
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default:
            return false;
        }
    }
}