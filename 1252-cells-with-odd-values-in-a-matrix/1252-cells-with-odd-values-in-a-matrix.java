class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] columns = new int[n];

        for(int i = 0; i < indices.length; i++){
            rows[indices[i][0]] += 1;
            columns[indices[i][1]] += 1;
        }

        int cnt = 0;
        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < columns.length; j++){
                if((rows[i] + columns[j]) % 2 != 0){
                    cnt += 1;
                }
            }
        }
                   
        return cnt;
    }
}