class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparing((int[] a) -> a[0]).thenComparing(a -> a[1]));

        int answer = 0;
        for(int i = 0; i < points.length - 2; i++){
            answer = Math.max(answer, Math.abs(points[i][0] - (points[i + 1][0])));
        }
        return answer;
    }
}