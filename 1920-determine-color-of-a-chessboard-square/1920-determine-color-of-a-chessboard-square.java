class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean x = coordinates.charAt(0) % 2 == 1 ? false : true;
        boolean y = coordinates.charAt(1) % 2 == 1 ? false : true;

        if(x == y){
            return false;
        }else{
            return true;
        }
    }
}