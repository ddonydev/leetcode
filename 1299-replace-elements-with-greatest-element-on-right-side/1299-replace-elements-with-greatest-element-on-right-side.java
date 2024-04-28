class Solution {
    public int[] replaceElements(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                answer[i] = -1;
                break;
            }

            int max = 0;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            answer[i] = max;
        }
        return answer;
    }
}