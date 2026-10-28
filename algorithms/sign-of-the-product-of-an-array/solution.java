class Solution {
    public int arraySign(int[] nums) {
        // int prod=1;
        // for(int num:nums){
        //     prod*=num;
        // }
        // if(prod==0){
        //     return 0;
        // }else if(prod>0){
        //     return 1;
        // }else{
        //     return -1;
        // }

        int negCount=0;
        for(int num:nums){
            if(num==0){
                return 0;
            }
            if(num<0){
                negCount++;
            }

            
        }
        return (negCount%2==0)?1:-1;
        
    }
}