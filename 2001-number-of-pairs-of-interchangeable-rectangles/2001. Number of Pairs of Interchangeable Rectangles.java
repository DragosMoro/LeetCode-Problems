class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> map = new HashMap<>();
        long counter = 0;
        for(int i= 0;i<rectangles.length;i++)
        {
            double key = (double) rectangles[i][0] / rectangles[i][1];
            if (map.containsKey(key)) {
                counter += map.get(key);
            }
            long value = (long) map.getOrDefault(key,0L)+1;
            map.put(key, value);
            
        }
        return counter;
    }
}