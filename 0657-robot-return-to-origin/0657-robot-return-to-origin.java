class Solution {
    public boolean judgeCircle(String moves) {
        int[] loc = new int[2];
        
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                loc[0] += 1;
            }else if(moves.charAt(i) == 'D'){
                loc[0] -= 1;
            }else if(moves.charAt(i) == 'L'){
                loc[1] -= 1;
            }else if(moves.charAt(i) == 'R'){
                loc[1] += 1;
            }
        }
        
        if(loc[0] == 0 && loc[1] == 0){
            return true;
        }else{
            return false;
        }
    }
}