class Solution {
    public String removeOuterParentheses(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(stack.size() > 0){
                    answer += "(";
                }
                stack.push(s.charAt(i));
            }else{
                stack.pop();
                if(stack.size() > 0){
                    answer += ")";
                }
            }
        }
        return answer;
    }
}