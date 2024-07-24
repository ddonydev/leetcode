class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean c = false;
        boolean isSame = true;
        
        if(password.length() < 8){
            return false;
        }
        
        String rex = "!@#$%^&*()-+";
        for(int i = 0; i < password.length(); i++){
            if (Character.isLowerCase(password.charAt(i))){
                lower = true;
            }
            if(Character.isUpperCase(password.charAt(i))){
                upper = true;
            }
            if(Character.isDigit(password.charAt(i))){
                digit = true;
            }
            if(rex.contains(String.valueOf(password.charAt(i)))){
                c = true;
            }
            if(i > 0){
                if(password.charAt(i) == password.charAt(i - 1)){
                    return false;
                }
            }
        }
        
        return lower && upper && digit && c && isSame;
    }
}