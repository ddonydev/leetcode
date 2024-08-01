class Solution {
    public int countSeniors(String[] details) {
            
        int cnt = 0;
        for(int i = 0; i < details.length; i++){
            char a = details[i].charAt(11);
            char b = details[i].charAt(12);
            
            String str = details[i].substring(11, 13);

            if(Integer.parseInt(str) > 60){
                cnt++;
            }
        }
        
        return cnt;
    }
}