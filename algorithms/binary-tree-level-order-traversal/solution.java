class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>count=new HashMap<>();
        HashMap<Integer,Integer>first=new HashMap<>();
        HashMap<Integer,Integer>last=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            if(!first.containsKey(nums[i])){
                first.put(nums[i],i);
            }
            last.put(nums[i],i);

            
        }

        int degree=Collections.max(count.values());
        int ans=nums.length;
        for(int x:count.keySet()){
            if(count.get(x)==degree){
                ans=Math.min(ans,last.get(x)-first.get(x)+1);
            }
        }
        return ans;
        
    }
}