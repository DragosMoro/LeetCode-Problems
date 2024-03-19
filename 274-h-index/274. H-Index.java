class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int el = 0;
        for(int i=0;i<citations.length;i++)
        {
            if(citations[i] >= citations.length-i)
            {
               el = Math.max(citations.length-i, el);
            }
        }
        return el;
    }
}