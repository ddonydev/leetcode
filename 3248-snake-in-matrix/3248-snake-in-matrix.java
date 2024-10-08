class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("DOWN", n);
        map.put("UP", -n);
        map.put("RIGHT", 1);
        map.put("LEFT", -1);
        int answer = 0;
        for(int i = 0; i < commands.size(); i++){
            answer = answer + map.get(commands.get(i));
        }

        return answer;
    }
}