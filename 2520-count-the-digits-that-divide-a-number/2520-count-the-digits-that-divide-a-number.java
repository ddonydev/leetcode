class Solution {
    public int countDigits(int num) {
        int[] arrNum = Stream.of(String.valueOf(num).split(""))
            .mapToInt(Integer::parseInt).toArray();
        
        int cnt = 0;
        for(int i : arrNum){
            if(num % i == 0){
                cnt++;
            }
        }
        
        return cnt;
    }
}