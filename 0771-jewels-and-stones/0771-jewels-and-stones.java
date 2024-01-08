class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String[] jStr = jewels.split("");
        String[] stoneStr = stones.split("");
        
        int answer = 0;
        for(int i = 0; i < jStr.length; i++){
            for(int j = 0; j < stoneStr.length; j++){
                if(jStr[i].equals(stoneStr[j])){
                    answer++;
                }
            }
        }
        return answer;
    }
}