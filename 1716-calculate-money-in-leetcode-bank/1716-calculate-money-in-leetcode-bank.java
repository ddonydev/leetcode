class Solution {
    public int totalMoney(int n) {
        int week = 1;
        
        int price = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += price;
            price++;
            
            if(i % 7 == 0){
                week++;
                price = week;
            }
        }
        
        return sum;
    }
}