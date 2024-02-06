class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, String> map = new HashMap<>();

        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            map.put(indices[i], str[i]);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        String answer = "";
        for (Integer key : keySet) {
            answer += map.get(key);
        }
        return answer;
    }
}