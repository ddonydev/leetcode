class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for (String sentence : sentences) {
            String[] s = sentence.split(" ");
            answer = Math.max(answer, s.length);
        }
        return answer;
    }
}