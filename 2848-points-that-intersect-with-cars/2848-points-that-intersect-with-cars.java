class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] n = new int[101];
        
        for(int i = 0; i < nums.size(); i++){
            for(int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++){
                if(n[j] == 0){
                    n[j] = 1;
                }
            }
        }
        
        return Arrays.stream(n).sum();
    }
}