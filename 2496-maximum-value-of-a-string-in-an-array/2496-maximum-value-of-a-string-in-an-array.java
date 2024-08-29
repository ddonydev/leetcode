class Solution {
    public int maximumValue(String[] strs) {
        int answer = 0;
        for(int i = 0; i < strs.length; i++){
            boolean flag = false;
            for (int j = 0; j < strs[i].length(); j++) {
                if(strs[i].charAt(j) >= 'a' && strs[i].charAt(j) <= 'z'){
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
            if (flag) {
                answer = Math.max(answer, strs[i].length());
            }else{
                answer = Math.max(answer, Integer.parseInt(strs[i]));
            }
        }
        return answer;
    }
}