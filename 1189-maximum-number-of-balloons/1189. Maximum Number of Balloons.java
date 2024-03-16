class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> textMap = new HashMap<>();
        Map<Character, Integer> baloonMap = new HashMap<>();
        String bal = "balloon";
        int res = text.length();
        for (int i = 0; i < bal.length(); i++) {
            if (baloonMap.containsKey(bal.charAt(i))) {
                baloonMap.put(bal.charAt(i), baloonMap.get(bal.charAt(i)) + 1);
            } else {
                baloonMap.put(bal.charAt(i), 1);
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (textMap.containsKey(text.charAt(i))) {
                textMap.put(text.charAt(i), textMap.get(text.charAt(i)) + 1);
            } else {
                textMap.put(text.charAt(i), 1);
            }
        }
        for(Character c: baloonMap.keySet())
        {
            res = Math.min(res,textMap.getOrDefault(c,0)/baloonMap.get(c));
        }
        return res;
    }
}