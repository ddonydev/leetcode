class Solution {
    public int countPoints(String rings) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i < rings.length() - 1; i += 2){
            int num = Integer.parseInt(String.valueOf(rings.charAt(i + 1)));
            String color = String.valueOf(rings.charAt(i));
            if(map.containsKey(num)){
                if(map.get(num).contains(color)){
                    continue;
                }
                map.get(num).add(color);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(color);
                map.put(num, list);
            }
        }

        int cnt = 0;
        for (Integer i : map.keySet()) {
            if(map.get(i).size() == 3){
                cnt++;
            }
        }
        
        return cnt;
    }
}