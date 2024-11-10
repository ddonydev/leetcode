class Solution {
    public int minDeletionSize(String[] strs) {
        int answer = 0;
        
        for(int i = 0; i < strs[0].length(); i++){
            boolean flag = true;
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) > strs[j + 1].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                answer++;
            }
        }
        
        return answer;
            
    }
}