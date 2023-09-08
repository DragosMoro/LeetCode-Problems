import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int el:stones)
        {
            pq.offer(el);
        }
        while(pq.size()>1)
        {
            int first= pq.poll();
            int second = pq.poll();
            if(first!=second)
            {
                pq.offer(first-second);
            }
        }
        if(pq.size()==1)
        {
            return pq.peek();    
        }
        return 0;
        
    }
}