class Solution {
    public int arraySign(int[] nums) {
        double product=1;
        for(int num: nums)
        {
            product=product*num;
        }
        System.out.println(product);
        return signFunc(product);
    }
    public int signFunc(double x)
    {
        if(x>0)
        {
            return 1;
        }
        if(x<0)
        {
            return -1;
        }
       return 0;
    }
}