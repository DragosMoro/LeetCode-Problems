import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> dict = new HashMap<>();
        if(strs.length<1)
        {
            List<List<String>> lista = new ArrayList<>();
            return lista;
        }
        for(int i=0;i<strs.length;i++)
        {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            if(dict.containsKey(toString(chars)))
            {
                
            }
            // dict.put(toString(chars), strs[i]);
            

        }
        return dict;      
        }
}