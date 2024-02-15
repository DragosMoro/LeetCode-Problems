class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, List<Integer>> res = new HashMap<>();
        for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer>  entry: freq.entrySet())
        {
            if(res.containsKey(entry.getValue()))
            {
                List<Integer> lista = new ArrayList<>();
                lista = res.get(entry.getValue());
                lista.add(entry.getKey());
                res.replace(entry.getValue(), lista);
            }
            else{
                List<Integer> lista = new ArrayList<>();
                lista.add(entry.getKey());
                res.put(entry.getValue(), lista);
            }
        }
        int[] output = new int[k];
        int pos=0;
        for(int i=nums.length;i>0;i--)
        {
            if(res.containsKey(i))
            {
                List<Integer> lista = new ArrayList<>();
                lista = res.get(i);
                for(Integer el:lista){
                    output[pos] = el;
                    pos++;
                    if(pos == k)
                    {
                        return output;
                    }
                }
            }
        }

    return output;
    }
}