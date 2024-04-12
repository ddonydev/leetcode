class Solution {
    public int addDigits(int num) {
        if(num <= 1){
            return num;
        }
        
        
        
        int result = num;
        while(result > 9){
            String n = String.valueOf(result);
            String[] str = n.split("");
            
            int tmp = 0;
            for(String s : str){
                tmp += Integer.parseInt(s);
            }
            
            result = tmp;
        }
        
        return result;
        
    }
}