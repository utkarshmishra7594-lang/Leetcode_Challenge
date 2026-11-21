class Solution {
    public int differenceOfSum(int[] nums) {
        // int n=nums.length;
        // int elementSum=0;
        // int digitSum=0;
        // for(int i=0;i<n;i++){
        //     elementSum+=nums[i];
        //     while(nums[i]>0){
        //         int d=nums[i]%10;
        //         digitSum+=d;
        //         nums[i]/=10;

        //     }

        // }
        // return Math.abs(elementSum-digitSum);
        int n=nums.length;
        int elementSum=0;
        int digitSum=0;
        for(int i=0;i<n;i++){
            elementSum+=nums[i];
            int temp=nums[i];
            while(temp>0){
                int d=temp%10;
                digitSum+=d;
                temp/=10;

            }

        }
        return Math.abs(elementSum-digitSum);
        
    }
}