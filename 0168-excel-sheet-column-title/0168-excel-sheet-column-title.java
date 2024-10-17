class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder answer = new StringBuilder();

        while(columnNumber > 0) {
            columnNumber--;
            int num = columnNumber % 26;
            char c = (char)(num + 'A');
            answer.append(c);
            columnNumber/=26;
        }

        return answer.reverse().toString();
    }
}