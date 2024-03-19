class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        int[] freqChar = new int[26];
        for(int i=0;i<tasks.length;i++)
        {
            freqChar[tasks[i]-'A']++;
        }
        for(int i=0;i<freqChar.length;i++)
        {
            if(freqChar[i]>0)
            {
                maxHeap.add(freqChar[i]);
            }
        }
        int counter = 0;
        while (!maxHeap.isEmpty() || !q.isEmpty()) 
        {
            if (!maxHeap.isEmpty()) {
                int top = maxHeap.poll() - 1;
                if (top > 0) {
                    q.add(new Pair<>(top, counter + n));
                }
            }
    
            while (!q.isEmpty() && q.peek().getValue() <= counter) {
                maxHeap.add(q.poll().getKey());
            }
            
            counter++;
        }

        return counter;


    }
}