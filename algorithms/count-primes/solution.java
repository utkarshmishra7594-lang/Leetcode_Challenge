class Solution{
    public int countPrimes(int n){
        boolean[] prime=new boolean[n];
        for(int i=2;i<n;i++){
            prime[i]=true;
        }

        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }

}




















// class Solution {
//     public int countPrimes(int n) {
//         int count=0;
//         for(int i=2;i<n;i++){
//             if(is_prime(i)){
//                 count++;
//             }
    

//         }
//         return count;

        
//     }
//     boolean is_prime(int num){
//         if(num<=1){
//             return false;
//         }
//         for(int i=2;i*i<=num;i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }