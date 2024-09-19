class Solution {
    public int findChampion(int[][] grid) {
        int len = grid.length;

        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (i != j && grid[j][i] == 1) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }
        }

        return -1; 
    }
}