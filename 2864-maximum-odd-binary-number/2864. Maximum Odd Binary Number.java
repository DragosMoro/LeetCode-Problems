class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[] arr = new int[2];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                arr[1]++;
            }
            else{
                arr[0]++;
            }
        }
        while(arr[1]>1)
        {
            sb.append('1');
            arr[1]--;
        }
        while(arr[0]>0)
        {
            sb.append('0');
            arr[0]--;
        }
        sb.append('1');
        
        return sb.toString();
    }
}