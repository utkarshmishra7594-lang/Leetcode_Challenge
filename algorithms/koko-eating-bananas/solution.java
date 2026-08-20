class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int result=-1;
        while(low<=high){
            int guess=(low+high)/2;
            long hour=timetofinish(piles,n,guess);
            if(hour>h){
                low=guess+1;
            }else{
                result=guess;
                high=guess-1;
            }


        }
        return result;
        
    }
    //helper function
    private long timetofinish(int[] piles,int n,int speed){
        long time=0;
        for(int i=0;i<n;i++){
            time+=piles[i]/speed;
            if(piles[i]%speed!=0){
                time++;
            }
        }
        return time;
    }
}