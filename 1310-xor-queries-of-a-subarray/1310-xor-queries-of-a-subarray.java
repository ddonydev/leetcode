class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int tmp = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                tmp = tmp ^ arr[j];
            }
            answer[i] = tmp;
        }
        return answer;
    }
}