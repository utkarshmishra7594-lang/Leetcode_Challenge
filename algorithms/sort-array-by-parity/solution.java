class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //brute(time o(n) and space o(n))
        int n=nums.length;
        // int[] result=new int[n];
        // int index=0;
        // for(int num:nums){
        //     if(num%2==0){
        //         result[index]=num;
        //         index++;
        //     }
        // }
        // for(int num:nums){
        //     if(num%2!=0){
        //         result[index]=num;
        //         index++;
        //     }
        // }
        // return result;
        //optimal(without using extra space)
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
            }else if(nums[j]%2!=0){
                j--;
            }else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            
            
        }
        return nums;

        
        
    }
}