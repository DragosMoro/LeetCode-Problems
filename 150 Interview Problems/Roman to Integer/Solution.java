class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        int number = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i)){
                case 'I' -> {
                    result=1;
                    break;
                }
                case 'V' -> {
                    result=5;
                    break;
                }
                case 'X' ->{
                    result=10;
                    break;
                }
                case 'L' -> {
                    result=50;
                    break;
                }
                case 'C' ->{
                    result=100;
                    break;
                }
                case 'D' -> {
                    result=500;
                    break;
                }
                case 'M' ->{
                    result=1000;
                    break;
                }

            }
            if(prev >result)
            {
                number -= result;
            }
            else{
                number +=result;
            }
            prev = result;
        }
    return number;
    }
}