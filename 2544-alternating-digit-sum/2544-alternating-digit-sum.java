class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }
        
        int answer = 0;
        int index = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            if(index % 2 == 0){
                answer += list.get(i);
            }else{
                answer -= list.get(i);
            }
            index++;
        }
        
        return answer;
    }
}