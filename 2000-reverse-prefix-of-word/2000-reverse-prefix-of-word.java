class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        String s = word.substring(0, index + 1);

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return word.replace(s, sb.toString());
        
    }
}