class Solution {
    public String interpret(String command) {
        Queue<String> queue = new LinkedList<>();

        String[] str = command.split("");
        for (String s : str) {
            queue.add(s);
        }

        String s = "";
        String answer = "";
        while (!queue.isEmpty()) {
            s += queue.poll();
            if (s.equals("G")) {
                answer += "G";
                s = "";
            } else if (s.equals("()")) {
                answer += "o";
                s = "";
            } else if (s.equals("(al)")) {
                answer += "al";
                s = "";
            }
        }
        return answer;
    }
}