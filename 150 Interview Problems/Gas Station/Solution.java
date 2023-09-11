class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        int sum = 0;
        int result = 0;
        for(int i=0;i<gas.length;i++)
        {
            totalCost += cost[i];
            totalGas +=gas[i];
        }
        if(totalCost-totalGas>0)
        {
            return -1;
        }
        else{
            for(int i=0;i<gas.length;i++)
            {
                sum +=gas[i] - cost[i];
                if(sum<0)
                {
                    sum = 0;
                    result = i+1;
                }
            }
        }
        return result;
    }
}