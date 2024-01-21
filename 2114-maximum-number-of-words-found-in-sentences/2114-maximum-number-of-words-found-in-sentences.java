class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            answer = Math.max(answer, s.length);
        }
        return answer;
    }
}