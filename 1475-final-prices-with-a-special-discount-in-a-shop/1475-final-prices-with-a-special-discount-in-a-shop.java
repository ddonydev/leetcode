class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        
        int index = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    answer[index] = prices[i] - prices[j];
                    break;
                }else{
                    answer[index] = prices[i];
                }
            }
            index++;
        }
        
        if(index < prices.length){
            for(int i = index; i < prices.length; i++){
                answer[i] = prices[i];
            }
        }
        
        return answer;
    }
}