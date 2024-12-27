class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int answer = 0;

        for(int i = low; i <= high; i++){
            String str = String.valueOf(i);
            int sum = 0;
            int len = str.length();
            if(len % 2 != 0){
                continue;
            }
            for(int j = 0; j < len / 2; j++){
                sum += str.charAt(j) - str.charAt(len - j - 1);
            }
            if(sum == 0){
                answer++;
            }
        }
        return answer;
    }
}