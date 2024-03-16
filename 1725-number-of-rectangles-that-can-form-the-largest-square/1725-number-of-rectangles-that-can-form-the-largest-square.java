class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] len = new int[rectangles.length];
        
        for(int i = 0; i < rectangles.length; i++){
            len[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }
        
        int maxLen = Arrays.stream(len).max().getAsInt();
        return (int) Arrays.stream(len).filter(x -> x == maxLen).count();
    }
}