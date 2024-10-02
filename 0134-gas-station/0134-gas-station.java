class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gCost =0, cCost = 0, total = 0, start = 0;
        for(int i =0; i<cost.length; i++){
            gCost+= gas[i];
            cCost+= cost[i];
        }

        if(gCost < cCost) return -1;

        for(int i=0; i<cost.length; i++){
            total += gas[i] - cost[i];
            if(total<0){
                total = 0;
                start = i+1;
            } 

        }

        return start;
        
    }
}