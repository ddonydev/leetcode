class Solution {
    public int getLucky(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 1; i < 27; i++){
            map.put((char) (i + 96), i);
        }
        
        String str = "";
        for(int i = 0; i < s.length(); i++){
            str += String.valueOf(map.get(s.charAt(i)));
        }
        int answer = 0;
        while(k > 0){
            int sum = 0;
            for(int i = 0; i < str.length(); i++){
                sum += str.charAt(i) - '0';
            }
            k--;
            answer = sum;
            str = String.valueOf(answer);
        }
        
        return answer;
    }
}