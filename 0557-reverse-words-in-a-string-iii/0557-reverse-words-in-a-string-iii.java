class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            StringBuffer sb = new StringBuffer(str[i]);
            if(i == str.length - 1){
                answer += sb.reverse().toString();
            } else {
                answer += sb.reverse().toString() + " ";
            }
        }
        return answer;
    }
}