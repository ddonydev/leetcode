class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(i < 3){
                    list.add(1);
                }else{
                    if(j == 0 || j == i - 1){
                        list.add(1);
                    }else{
                        list.add(answer.get(i - 2).get(j - 1) + answer.get(i - 2).get(j));
                    }
                }
            }
            answer.add(list);
        }
        
        return answer;
    }
}