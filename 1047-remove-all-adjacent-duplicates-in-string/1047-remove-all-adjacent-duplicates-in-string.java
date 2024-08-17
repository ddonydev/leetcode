class Solution {
    public String removeDuplicates(String s) {
        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(list.size() > 0 && list.get(list.size() - 1).equals(String.valueOf(s.charAt(i)))){
                list.remove(list.size() - 1);
            }else{
                list.add(String.valueOf(s.charAt(i)));
            }
        }

        String answer = "";
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}