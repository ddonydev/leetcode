class Solution {
    public String digitSum(String s, int k) {
        while(k < s.length()){
            String str = ""; 
            for(int i = 0; i < s.length(); i += k){
                String tmp = s.substring(i, Math.min(i + k, s.length()));
                int sum = 0;
                for(int j = 0; j < tmp.length(); j++){ 
                    sum += tmp.charAt(j) - '0';
                }
                str += "" + sum;              
            }
            s = str; 
        }
        return s;
    }
}