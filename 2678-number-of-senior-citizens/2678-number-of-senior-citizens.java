class Solution {
    public int countSeniors(String[] details) {
            
        int cnt = 0;
        for(int i = 0; i < details.length; i++){
            char a = details[i].charAt(11);
            char b = details[i].charAt(12);

            int age = Integer.parseInt(String.valueOf(a) + String.valueOf(b));

            if(age > 60){
                cnt++;
            }
        }
        
        return cnt;
    }
}