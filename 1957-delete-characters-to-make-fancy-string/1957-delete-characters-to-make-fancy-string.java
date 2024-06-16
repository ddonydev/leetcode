class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        char c = s.charAt(0);
        int cnt = 1;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                cnt++;
            }else{
                c = s.charAt(i);
                cnt = 1;
            }

            if(cnt < 3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}