import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        if(nums.length==1)
        {
             res.add(Integer.toString(nums[0]));
            return res;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1] == nums[i]+1 )
            {
                if(counter==0)
                {
                    sb.append(nums[i]);
                    sb.append("->");
                    counter++;

                }
                else{
                    counter++; 
                }
              
            }
            else{

                if(counter==0)
                {
                    res.add(Integer.toString(nums[i]));
                }
                else{
                    sb.append(nums[i]);
                    res.add(sb.toString());
                    sb = new StringBuilder();
                    counter=0;
                }
            }
            if(i == nums.length-2)
            {
                if(counter !=0)
                {
                    sb.append(nums[i+1]);
                    res.add(sb.toString());
                    sb = new StringBuilder();
                    counter=0;
                }
                else{
                    res.add(Integer.toString(nums[i+1]));
                }

            }
        

        }
        return res;
    }
}
