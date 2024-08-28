class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int j = 0;
        int answer = 0;
        for(int i = 0; i < grid.length; i++){
            Arrays.sort(grid[i]);
        }
        while(j < grid[0].length){
            int max = 0;
            for(int i = 0; i < grid.length; i++){
                max = Math.max(max, grid[i][j]);
            }
            j++;
            answer += max;
        }
        return answer;
    }
}