
//O(log⁡(N−k)+k).

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      List<Integer> res = new ArrayList<>();  
			int left = 0;
			int right = arr.length-k;
			while(left<right)
			{
				int mid = left+(right-left)/2;
				if(x-arr[mid]>arr[mid+k]-x)
				{
					left = mid+1;
				}
				else{
					right = mid;
				}
			}
			for(int i=left;i<left+k;i++)
			{
				res.add(arr[i]);
			}
			return res;

    }
}