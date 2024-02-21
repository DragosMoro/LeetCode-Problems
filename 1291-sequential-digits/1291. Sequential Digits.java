class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int length = 0;
        int copy = low;
        int first = 0;
        List<Integer> list = new ArrayList<>();
        while(copy>0)
        {
            if(copy<=9 && copy>0)
            {
                first = copy;
            }
            copy = copy/10;
            length++;
        }
        while(true)
        {
            int el = 0;
            if(first+length>10)
            {
                first = 1;
                length++;
            }
            for(int i=first;i<first+length;i++)
            {
                el = el*10+i;
            }
            if(el<=high)
            {
                if(el>=low)
                {
                list.add(el);
                }
            }
            else{
                break;
            }
            first++;
        }
        return list;
    }
}