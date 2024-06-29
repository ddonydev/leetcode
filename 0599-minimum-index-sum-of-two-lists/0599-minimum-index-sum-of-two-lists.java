class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])) {
                map.put(list2[i], map.get(list2[i]) + i);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    list.add(list1[i]);
                }
            }
        }
        
        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) < min) {
                result.clear();
                result.add(list.get(i));
                min = map.get(list.get(i));
            } else if (map.get(list.get(i)) == min) {
                result.add(list.get(i));
            }
        }
        return result.toArray(new String[result.size()]);
    }
}