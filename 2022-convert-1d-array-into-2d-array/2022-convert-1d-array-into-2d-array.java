class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m * n != original.length){
            return new int[][]{};
        }
        int[][] answer = new int[m][n];
        int index = 0;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] = original[index++];
            }
        }
        
        return answer;
    }
}