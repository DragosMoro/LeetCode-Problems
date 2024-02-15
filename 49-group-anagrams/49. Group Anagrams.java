class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs)
        {
            char[] elem = str.toCharArray();
            Arrays.sort(elem);
            String sortedStr = String.valueOf(elem);
            if(map.containsKey(sortedStr))
            {
                map.get(sortedStr).add(str);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet())
        {
            result.add(entry.getValue());
        }
        return result;
        
    }
}