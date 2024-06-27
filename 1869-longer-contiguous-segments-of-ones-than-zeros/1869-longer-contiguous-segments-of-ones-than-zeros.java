class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0;
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                one = Math.max(one, len += 1);
            }else{
                len = 0;
            }
        }
        
        int zero = 0;
        len = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zero = Math.max(zero, len += 1);
            }else{
                len = 0;
            }
        }

        
        if(one > zero){
            return true;
        }else{
            return false;
        }
    }
}