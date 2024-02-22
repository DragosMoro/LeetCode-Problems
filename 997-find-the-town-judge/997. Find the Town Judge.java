class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> map = new HashMap<>();
        if(n == 1 && trust.length == 0)
        {
            return n;
        }
        for(int[] subarray:trust)
        {
            if(map.size() == 0)
            {
                map.put(subarray[1], 1);
            }
            else{
                if(map.getOrDefault(subarray[1], -1) == -1)
                {
                    map.put(subarray[1], 1);
                }
                else{
                    map.put(subarray[1], map.get(subarray[1])+1);
                }
            }
        }

        int result = -1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() == n-1)
            {
                result = entry.getKey();
            }
        }
        
        for(int[] subarray:trust)
        {
            if(subarray[0] == result)
            {
                return -1;
            }
        }

        return result;
    }
}