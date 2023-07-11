class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if(words.length != pattern.length()) 
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            if(!map.containsValue(words[i])){
                map.putIfAbsent(pattern.charAt(i), words[i]);
            }
           
            if(!Objects.equals(words[i], map.get(pattern.charAt(i))))
            {
                return false;
            }
        }
        return true;

    }
}