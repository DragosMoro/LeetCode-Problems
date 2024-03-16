class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       int zero=0;
       int one = 0;
       int max=0;
       map.put(0,-1);
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i] == 0)
        {
            zero++;
        }
        else{
            one++;
        }
        int dif = zero-one;
        if(map.containsKey(dif))
        {
            max = Math.max(max, i-map.get(dif));
        }
        else{
            map.put(dif,i);
        }
       }
       return max;

        
    }
}