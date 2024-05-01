class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int cnt = 0;
        
        for(int i = 0; i < batteryPercentages.length; i++){
            if(batteryPercentages[i] <= 0){
                continue;
            }
            cnt++;
            if(i < batteryPercentages.length - 1){
                for(int j = i + 1; j < batteryPercentages.length; j++){
                    batteryPercentages[j] -= 1;
                }
            }
        }
        return cnt;
    }
}