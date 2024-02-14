class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new LinkedHashMap<>();
        int j = 0;
        for (int i = 0; i < key.length(); i++) {
            if(key.charAt(i) == ' ' || map.containsKey(key.charAt(i))) {
                continue;
            }
            map.put(key.charAt(i), (char)(j + 97));
            j++;
        }

        String answer = "";
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') {
                answer += " ";
                continue;
            }
            answer += map.get(message.charAt(i));
        }
        return answer;
    }
}