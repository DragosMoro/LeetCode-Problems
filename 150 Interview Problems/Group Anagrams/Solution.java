class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();
        List<List<String>> finalList = new ArrayList<>();
        if(strs.length<1)
        {
            List<List<String>> lista = new ArrayList<>();
            return lista;
        }
        for(int i=0;i<strs.length;i++)
        {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(dict.containsKey(str))
            {
                List<String> elem = dict.get(str);
                elem.add(strs[i]);
                dict.replace(str, elem);
            }
            else{
                 List<String> elem = new ArrayList<>();
                elem.add(strs[i]);
                dict.put(str, elem);    
            }
                
            
        }

        for(Map.Entry<String, List<String>> entry: dict.entrySet())
        {
            finalList.add(entry.getValue());
        }    
        return finalList;
        }
}