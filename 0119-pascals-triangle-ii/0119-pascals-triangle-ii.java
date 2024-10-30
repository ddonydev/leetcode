class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();
        
        if(rowIndex == 0){
             List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        for(int i = 1; i <= rowIndex + 1; i++){
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
        return answer.get(answer.size() - 1);
    }
}