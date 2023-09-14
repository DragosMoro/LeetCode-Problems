import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumOcurrances = new HashMap<>();
        int sum = 0;
        int result = 0;
        //pentru ca acesta ne asigura sa includem si intreaga secventa actuala
        sumOcurrances.put(0,1); 
        for(int i=0;i<nums.length;i++)
        {
            sum +=nums[i];
            if(sumOcurrances.containsKey(sum-k))
            {
                result +=sumOcurrances.get(sum-k);
            }
            if(!sumOcurrances.containsKey(sum))
            {
                sumOcurrances.put(sum, 1);
            }
            else{
                sumOcurrances.put(sum, sumOcurrances.get(sum)+1);
            }
        }
        return result;
    }
}