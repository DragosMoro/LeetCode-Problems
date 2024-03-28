class Solution {
    public int[] twoSum(int[] nums, int target) {
        int requestedNumber = 0;
        int result[] = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        for (int i=0; i< nums.length;i++){
            requestedNumber = target - nums[i];
            if(hashMap.containsKey(requestedNumber) && hashMap.get(requestedNumber)!=i){
                result[0] = i;
                result[1] = hashMap.get(requestedNumber);
                break;
            }
        

        
        }
    return result;
    }   
}