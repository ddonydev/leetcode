class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, Collections.reverseOrder());

        String[] answer = new String[names.length];

        int index = 0;
        for (Integer i : keySet) {
            answer[index] = map.get(i);
            index++;
        }
        
        return answer;
    }
}