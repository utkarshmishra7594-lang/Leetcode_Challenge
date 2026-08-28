class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>result=new ArrayList<>();
        long val=1;
        for(int k=0;k<=rowIndex;k++){
            result.add((int)val);
            val=val*(rowIndex-k)/(k+1);
        }
        return result;
        
        
    }
}