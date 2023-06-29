import java.util.Objects;

class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length-1;
        int currentPos=len;
        int k = 0;
        int i=0;
        while(i<= currentPos)
        {
            if(Objects.equals(nums[i], val))
            {
                if (Objects.equals(nums[currentPos], val))
                {
                    currentPos--;
                }
                else{
                    int aux=nums[i];
                    nums[i] = nums[currentPos];
                    nums[currentPos] = aux;
                    i++;
                    currentPos--;
                    k++;

                }
            }
            else{
                i++;
                k++;
            }
        }
        return k;
    }
}