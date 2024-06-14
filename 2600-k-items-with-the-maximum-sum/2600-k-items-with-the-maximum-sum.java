class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        if(k < numOnes){
            for(int i = 0; i < k; i++){
                sum += 1;
            }
            return sum;
        }else{
            k -= numOnes;
            for(int i = 0; i < numOnes; i++){
                sum += 1;
            }
            if(k < numZeros){
                return sum;
            }else{
                k -= numZeros;
                for(int i = 0; i < k; i++){
                    sum += -1;
                }
            }
        }
        
        return sum;
        
        
        
    }
}