class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> map = new HashMap<>();
        for(int i= 0;i<rectangles.length;i++)
        {
             double key = (double) rectangles[i][0] / rectangles[i][1];
            if (map.containsKey(key)) {
                long value = (long) map.get(key)+1;
                map.put(key, value);
            } else {
                map.put(key, 1L);
            }
            
        }
        long counter = 0;
        for(Map.Entry<Double, Long> entry: map.entrySet())
        {
            if(entry.getValue()>=2)
            {
                counter += ((entry.getValue()*(entry.getValue()-1))/2);
            }
        }
        return counter;
    }
}