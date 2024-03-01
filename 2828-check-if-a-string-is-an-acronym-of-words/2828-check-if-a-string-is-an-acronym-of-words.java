class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String tmp = "";
        for (String word : words) {
            tmp += word.charAt(0);
        }

        if (s.equals(tmp)) {
            return true;
        }
        
        return false;
    }
}