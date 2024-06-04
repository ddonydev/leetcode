class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2)); 
            }else if(operations[i].equals("D")){
                list.add((list.get(list.size() - 1) * 2));
            }else if(operations[i].equals("C")){
                list.remove(list.size() - 1);
            }else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        
        int answer = 0;
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}