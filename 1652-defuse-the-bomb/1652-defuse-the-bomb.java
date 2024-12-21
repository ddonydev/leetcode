class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] answer = new int[code.length];
        if(k == 0){
            return answer;
        }
        
        int start = 1;
        int end = k;
        
        int sum = 0;
        if(k < 0){
            k = -k;
            start = code.length - k;
            end = code.length - 1;
        }
        
        for(int i = start; i <= end; i++){
            sum += code[i];
        }
        for(int i = 0; i < code.length; i++){
            answer[i] = sum;
            sum -= code[(start++) % code.length];
            sum += code[(++end) % code.length];
        }
        
        return answer;
    }
}


        