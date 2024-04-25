class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int num = 0;
        for(int i = 97; i <= 106; i++){
            map.put((char) i, num++);
        }

        String s1 = "";
        for(int i = 0; i < firstWord.length(); i++){
            s1 += String.valueOf(map.get(firstWord.charAt(i)));
        }

        String s2 = "";
        for(int i = 0; i < secondWord.length(); i++){
            s2 +=  String.valueOf(map.get(secondWord.charAt(i)));
        }
        
        String s3 = "";
        for(int i = 0; i < targetWord.length(); i++){
            s3 +=  String.valueOf(map.get(targetWord.charAt(i)));
        }
        
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        
        return sum == Integer.parseInt(s3) ? true : false;
    }
}