class Solution {
    public int[][] divideArray(int[] nums, int k) {
         int[][] arr = new int[nums.length/3][3];
        Arrays.sort(nums);
        int listIndex = 0;
        int elementIndex = 0;
        for(int el:nums)
        {
            if(elementIndex>2)
            {
                elementIndex = 0;
                listIndex++;
            }
            for(int elem:arr[listIndex])
            {

                if(elem != 0 && Math.abs(el-elem)>k)
                {
                    return new int[0][0];
                }
            }
            arr[listIndex][elementIndex] = el;
            elementIndex++;
        }
        return arr;
    }
}