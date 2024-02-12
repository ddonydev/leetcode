class Solution {
    public int maximum69Number (int num) {
        String numStr = Integer.toString(num);
        String[] numArr = numStr.split("");
    

        int answer = num;
        for (int i = 0; i < numArr.length; i++) {
            int tmp = 0;
            if (numArr[i].equals("6")) {
                numArr[i] = "9";
                tmp = Integer.parseInt(String.join("", numArr));
                numArr[i] = "6";
            }else{
                numArr[i] = "6";
                tmp = Integer.parseInt(String.join("", numArr));
                numArr[i] = "9";
            }

            if (answer < tmp) {
                answer = tmp;
            }
        }
        return answer;
        
    }
}