class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("\\W+"," ");
        String[] arr = paragraph.split("\\s+");

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }


        String result = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return result;
    }
}