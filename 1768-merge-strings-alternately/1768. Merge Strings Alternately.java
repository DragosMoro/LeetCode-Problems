class Solution {
    public String mergeAlternately(String word1, String word2) {
        int firstPos = 0;
        int secondPos = 0;
        StringBuilder sb = new StringBuilder();
        while(firstPos <word1.length() && secondPos< word2.length())
        {
            sb.append(word1.charAt(firstPos));
            sb.append(word2.charAt(secondPos));
            firstPos++;
            secondPos++;
        }
        while(firstPos < word1.length())
        {
            sb.append(word1.charAt(firstPos));
            firstPos++;
        }
        while(secondPos < word2.length())
        {
            sb.append(word2.charAt(secondPos));
            secondPos++;
        }
        return sb.toString();

    }
}