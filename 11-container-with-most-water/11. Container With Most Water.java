class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right = height.length-1;
       int max=0;
       while(left<right)
       {
           int verif = Math.min(height[left],height[right]) * (right-left);
           if( verif > max)
           {
               max = verif;
           }
           if(height[left]<height[right])
           {
               left++;
           }
           else if(height[left]>height[right])
           {
               right--;
           }
           else{
               if(height[left+1]<height[right-1])
               {
                   right--;
               }
               else{
                   left++;
               }
           }
       }
       return max;
    }
}