class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        if(sChars.length != tChars.length)
        {
            return false;
        }
        for(int i=0;i<sChars.length;i++)
        {
            if(!map.containsKey(sChars[i]))
            {
                map.put(sChars[i], 1);
            }
            else
            {
                map.put(sChars[i], map.get(sChars[i])+1);
            }

        }
        for(int i=0;i<tChars.length;i++)
        {

            if(!map.containsKey(tChars[i]))
            {
                return false;
            }
            map.put(tChars[i], map.get(tChars[i])-1);
            if(map.get(tChars[i]) == 0)
            {
                map.remove(tChars[i]);
            }

        }
        return true;
    }
}