class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        
        Arrays.sort(hand);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i : hand){
            if(map.get(i) == 0) continue;
            map.put(i, map.get(i) - 1);

            for(int j = 1; j < groupSize; j++){
                if(map.getOrDefault(i + j, 0) == 0) {
                    return false;
                }
                map.put(i + j, map.get(i + j) - 1);
            }
        }
        
        return true;
        
    }
}