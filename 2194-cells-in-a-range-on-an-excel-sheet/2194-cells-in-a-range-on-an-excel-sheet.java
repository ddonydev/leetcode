class Solution {
    public List<String> cellsInRange(String s) {
        int min = s.charAt(1) - '0';
        int max = s.charAt(4) - '0';

        List<String> list = new ArrayList<>();
        if(min != max){
            for (int i = s.charAt(0); i <= s.charAt(3); i++) {
                for (int j = min; j <= max; j++) {
                    list.add((char)i + "" + j);
                }
            }
        }else{
            for (int i = s.charAt(0); i <= s.charAt(3); i++) {
                list.add((char)i + "" + min);
            }
        }
        
        return list;
    }
}