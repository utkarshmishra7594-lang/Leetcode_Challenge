class Solution {
    public boolean isPalindrome(int x) {
        // String s=Integer.toString(x);//convertinf x into a string
        // String rev=new StringBuilder(s).reverse().toString();
        // return s.equals(rev);

        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }

        int revHalf=0;
        while(x>revHalf){
            int d=x%10;
            revHalf=revHalf*10+d;
            x/=10;
        }

        return (x==revHalf || x==revHalf/10);


        
    }
}