class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length ==1)
        {
            return (Math.abs(flowerbed[0]-1) >= n);
        }
        for(int i=0;i<flowerbed.length-1;i++)
        {
            if(flowerbed[i] == 0)
            {
                if(i == 0 && flowerbed[i+1] == 0)
                {
                    count++;
                    flowerbed[i] = 1;
                }
                 else if(i==flowerbed.length-2 && flowerbed[i+1] == 0)
                {
                    count++;
                }
                else if(flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                    count++;
                    flowerbed[i] = 1;
                }
               
            }

        }
        if(count >= n)
        {
            return true;
        }
        return false;
    }
}