class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = customers[0][0];
        double answer = 0;
        for(int i = 0; i < customers.length; i++){
            if(currentTime < customers[i][0]){
                currentTime = customers[i][0];
            }
            int waitTime = currentTime - customers[i][0] + customers[i][1];
            answer += waitTime;
            currentTime += customers[i][1];
        }
        return (double) answer / customers.length;
    }
}