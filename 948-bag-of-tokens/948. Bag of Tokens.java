class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int max = 0;
        int temp = 0;
        int left=0;
        int right = tokens.length-1;
        int pow = power;
        Arrays.sort(tokens);
        while(left<=right)
        {
            if(tokens[left]<=pow)
            {
                temp++;
                max= Math.max(max, temp);
                pow = pow-tokens[left];
                left++;
            }
            else if( max>0 && tokens[left]>pow)
            {
                temp--;
                pow +=tokens[right];
                right--;
            }
            else{
                break;
            }
        }
        return max;
    }
}