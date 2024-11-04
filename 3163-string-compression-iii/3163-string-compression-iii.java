class Solution {
    public String compressedString(String word) {
        String answer = "";
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            cnt++;
            if(i == word.length() - 1){
                if(cnt == 10){
                    answer += String.valueOf(9) + word.charAt(i);
                }else{
                    answer += String.valueOf(cnt) + word.charAt(i);
                }
                break;
            }else{
                if(word.charAt(i) == word.charAt(i + 1)) {
                    if(cnt == 9){
                        answer += String.valueOf(9) + word.charAt(i);
                        cnt = 0;
                    }
                }else {
                    if(cnt == 10){
                        answer += String.valueOf(9) + word.charAt(i);
                    }else{
                        answer += String.valueOf(cnt) + word.charAt(i);
                    }
                    cnt = 0;
                }
            }
        }
        return answer;
        
        
    }
}