class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = brokenLetters.split("");
        String[] s = text.split(" ");

        
        int answer = 0;
        
        if(brokenLetters.equals("")){
            return s.length;
        }
        
        for(int i = 0; i < s.length; i++){
            int cnt = 0;
            for(int j = 0; j < str.length; j++){
                if(!s[i].contains(str[j])){
                    cnt++;
                }
            }

            if(cnt == str.length){
                answer++;
            }
        }
        
        return answer;
    }
}