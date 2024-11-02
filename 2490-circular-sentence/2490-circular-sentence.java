class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        if(arr.length == 1){
            if(arr[0].charAt(0) == arr[0].charAt(arr[0].length() - 1)){
                return true;
            }
            return false;
        }
        
        boolean answer = false;
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                if(arr[i].charAt(arr[i].length() - 1) == arr[0].charAt(0)){
                    answer = true;
                    break;
                }else{
                    return false;
                }
            }
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].charAt(arr[i].length() - 1) == arr[j].charAt(0)){
                    answer = true;
                    break;
                }else{
                    return false;
                }
            }
        }
        return answer;
    }
}