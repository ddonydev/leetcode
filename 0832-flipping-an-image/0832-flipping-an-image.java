class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] answer = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            int index = 0;
            for (int j = image[i].length - 1; j >= 0 ; j--) {
                answer[i][index] = image[i][j];
                index++;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if(answer[i][j] == 0) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        
        return answer;
    }
}