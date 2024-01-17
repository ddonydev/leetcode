class Solution {
    public String interpret(String command) {
        String[] str = command.split("");

        String tmp = "";
        String answer = "";
        for (String s : str) {
            tmp += s;
            if (tmp.equals("G")) {
                answer += "G";
                tmp = "";
            } else if (tmp.equals("()")) {
                answer += "o";
                tmp = "";
            } else if (tmp.equals("(al)")) {
                answer += "al";
                tmp = "";
            }
        }
        return answer;
    }
}