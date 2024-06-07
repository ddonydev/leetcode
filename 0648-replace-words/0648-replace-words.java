class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] str = sentence.split(" ");
        String answer = "";
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < dictionary.size(); j++){
                if(str[i].startsWith(dictionary.get(j))){
                    str[i] = dictionary.get(j);
                }
            }
            if (i == str.length - 1){
                answer += str[i];
            }
            else{
                answer += str[i] + " ";
            }
        }
        
        return answer;
    }
}