class Solution {
    public long pickGifts(int[] gifts, int k) {
        while(k > 0) {
            Arrays.sort(gifts);
            int tmp = (int) Math.sqrt(gifts[gifts.length - 1]);
            gifts[gifts.length - 1] = tmp;
            k--;
        }
        
        long answer = 0;
        for(int i = 0; i < gifts.length; i++){
            answer += gifts[i];
        }
        return answer;
    }
}