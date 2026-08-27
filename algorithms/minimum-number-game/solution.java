class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //approach 1
        // int left=0;
        // int right=0;
        // int k=0;
        // int[] temp=new int[m+n];
        // while(left<m && right<n){
        //     if(nums1[left]<nums2[right]){
        //         temp[k]=nums1[left];
        //         left++;
        //         k++;

        //     }else if(nums1[left]==nums2[right]){
        //         temp[k]=nums1[left];
        //         left++;
        //         k++;
        //         temp[k]=nums2[right];
        //         k++;
        //         right++;

        //     }else{
        //         temp[k]=nums2[right];
        //         right++;
        //         k++;
        //     }
        // }
        // while(left<m){
        //     temp[k]=nums1[left];
        //     left++;
        //     k++;
        // }
        // while(right<n){
        //     temp[k]=nums2[right];
        //     right++;
        //     k++;
        // }

        //approach 2
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            
            }else{
                nums1[k]=nums2[j];;
                j--;
            
            }
            k--;

        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }

        
    }
}