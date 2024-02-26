class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i), 1);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(map.get(words[i].charAt(j)) == null) {
                    cnt--;
                    break;
                }
            }
            cnt++;
        }
        return cnt;
    }
}