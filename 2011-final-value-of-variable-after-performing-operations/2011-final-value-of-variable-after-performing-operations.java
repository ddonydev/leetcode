class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].startsWith("+")){
                ++answer;
            }else if(operations[i].startsWith("-")){
                --answer;
            } else if (operations[i].endsWith("+")) {
                answer++;
            } else if (operations[i].endsWith("-")) {
                answer--;
            }
        }
        return answer;
    }
}