class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        Arrays.sort(nums);
        int listIndex = 0;
        int elementIndex = 0;
        for(int el:nums)
        {
            if(elementIndex>2)
            {
                elementIndex = 0;
                list.add(new ArrayList<>());
                listIndex++;
            }
            for(int elem:list.get(listIndex))
            {
                if(Math.abs(el-elem)>k)
                {
                    return new int[0][0];
                }
            }
            list.get(listIndex).add(el);
            elementIndex++;
        }
        int[][] arr = new int[list.size()][3];
        int i=0;
        for(List<Integer> elemList:list)
        {
            int j=0;
            for(int el:elemList)
            {
                arr[i][j] = el;
                j++;
            }
            i++;
        }
        return arr;
    }
}