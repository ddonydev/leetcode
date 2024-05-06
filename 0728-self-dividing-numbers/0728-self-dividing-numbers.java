class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left; i <= right; i++){
            if(i < 10){
                list.add(i);
            }else if(i % 10 != 0){
                int num = i;
                while(num > 0){
                    int divide = num % 10;
                    if(divide == 0 || i % divide != 0){
                        break;
                    }
                    num /= 10;
                }

                if(num == 0){
                    list.add(i);
                }
            }
        }
        
        return list;
    }
}