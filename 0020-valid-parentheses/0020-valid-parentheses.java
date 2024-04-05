class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                
                char a = stack.peek();
                if(a == '(' && c == ')' || a == '[' && c == ']' || a == '{' && c == '}'){
                    stack.pop();
                }else{
                    return false;
                }
            }     
        }   
        return stack.isEmpty();  
    }
}