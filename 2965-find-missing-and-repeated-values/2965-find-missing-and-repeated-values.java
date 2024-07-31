class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid[0].length * grid[0].length;
        
        int[] arr = new int[len + 1];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                arr[grid[i][j]]++;
            }
        }
        
        int[] answer = new int[2];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > 1){
                answer[0] = i;
            }
            if(arr[i] == 0){
                answer[1] = i;
            }
        }
        return answer;
    }
}