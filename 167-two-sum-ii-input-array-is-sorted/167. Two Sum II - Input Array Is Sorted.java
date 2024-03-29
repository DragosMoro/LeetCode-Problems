class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] res = new int[2];
        while(left<right)
        {
            if(target-numbers[left]>numbers[right])
            {
                left++;
            }
            else if(target-numbers[left]<numbers[right])
            {
                right--;
            }
            else{
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
        }
        return res;
    }
}