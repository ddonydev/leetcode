class Solution {
    public String reformatDate(String date) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        
        String[] str = date.split(" ");
        String year = "";
        String month = "";
        String day = "";
        
        for(int i = 0; i < str.length; i++){
            if(str[i].chars().allMatch(Character::isDigit)){
                year = str[i];
            }else if(map.containsKey(str[i])){
                month = map.get(str[i]);
            }else{
                str[i] = str[i].replaceAll("[stndrdth]", "");
                if(str[i].length() == 1){
                    day = "0" + str[i];
                }else {
                    day = str[i];
                }
            }
        }
        
        return year + "-" + month + "-" + day;
        
    }
}