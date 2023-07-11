import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letters = new HashMap<>();
        if(magazine.length()<ransomNote.length())
        {
            return false;
        }
        for(int i=0;i<magazine.length();i++)
        {
            if(!letters.containsKey(magazine.charAt(i)))
            {
                letters.put(magazine.charAt(i), 1);
            }
            else{
                letters.replace(magazine.charAt(i), letters.get(magazine.charAt(i))+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(!(letters.containsKey(ransomNote.charAt(i)) && letters.get(ransomNote.charAt(i)) != 0))
            {
                return false;
            }
            else{
                 letters.replace(ransomNote.charAt(i), letters.get(ransomNote.charAt(i))-1);
            }
        }
        return true;
    }
}