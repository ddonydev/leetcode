class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int len = nums.size();
        
        int answer = 0;
        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                if(i >= 0 && i < j){
                    int sum = nums.get(i) + nums.get(j);
                    if(sum < target){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}