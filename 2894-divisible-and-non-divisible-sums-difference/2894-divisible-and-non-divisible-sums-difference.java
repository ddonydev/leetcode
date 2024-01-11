class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer> isNotDiv = new ArrayList<>();
        List<Integer> isDiv = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(i % m != 0){
                isNotDiv.add(i);
            }else{
                isDiv.add(i);
            }
        }
        
        int sum1 = 0;
        for(int i = 0; i < isNotDiv.size(); i++){
            sum1 += isNotDiv.get(i);
        }
        
        int sum2 = 0;
        for(int i = 0; i < isDiv.size(); i++){
            sum2 += isDiv.get(i);
        }
        
        return sum1 - sum2;
        
    }
}