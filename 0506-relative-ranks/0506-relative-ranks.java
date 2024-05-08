class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < score.length; i++){
            map.put(score[i], i);
        }
        
        Arrays.sort(score);
        
        String[] answer = new String[score.length];
        if(score.length == 3){
            answer[map.get(score[score.length - 3])] = "Bronze Medal";
            answer[map.get(score[score.length - 2])] = "Silver Medal";
            answer[map.get(score[score.length - 1])] = "Gold Medal";
        }else if(score.length == 2){
            answer[map.get(score[score.length - 2])] = "Silver Medal";
            answer[map.get(score[score.length - 1])] = "Gold Medal";
        }else if(score.length == 1){
            answer[map.get(score[score.length - 1])] = "Gold Medal";
        }else {
            answer[map.get(score[score.length - 3])] = "Bronze Medal";
            answer[map.get(score[score.length - 2])] = "Silver Medal";
            answer[map.get(score[score.length - 1])] = "Gold Medal";
            int n = score.length;
            for(int i = 0; i < score.length - 3; i++){
                answer[map.get(score[i])] = String.valueOf(n);
                n--;
            }
        }
        return answer;
    }
}