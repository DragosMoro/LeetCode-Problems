class Solution {
    public int leastInterval(char[] tasks, int n) {
        // frequencies of the tasks
        int[] frequencies = new int[26];
        for (int t : tasks) {
            frequencies[t - 'A']++;
        }

        Arrays.sort(frequencies);

        int fMax = frequencies[25]-1;
        int idleTime = fMax * n;
        
       for(int i=24;i>=0;i--)
       {
           idleTime -= Math.min(fMax, frequencies[i]);
       }
       return idleTime>0 ? idleTime+tasks.length : tasks.length;
    }
}