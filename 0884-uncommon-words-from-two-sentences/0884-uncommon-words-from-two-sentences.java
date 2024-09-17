class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : arr2) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }
        
        return list.toArray(String[]::new);
    }
}