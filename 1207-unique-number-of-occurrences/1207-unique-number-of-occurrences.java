class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (Integer i : map.keySet()) {
            set.add(map.get(i));
        }
        
        if(map.size() == set.size()){
            return true;
        }else{
            return false;
        }
        
        
    }
}