class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean answer = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    if(arr[i] == arr[j] * 2){
                        answer = true;
                    }
                }
            }
        }
        return answer;
    }
}