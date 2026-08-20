class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                int left=mid;
                while(left>=0 && nums[left]==target){
                    result.add(left);
                    left--;
                }
                int right=mid+1;
                while(right<n && nums[right]==target){
                    result.add(right);
                    right++;
                }
                break;

            }else if(nums[mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
        Collections.sort(result);
        return result;


        
    }
}