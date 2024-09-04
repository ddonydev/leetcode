class Solution {
    public boolean areNumbersAscending(String s) {
        String num = s.replaceAll("([a-z])"," ").replaceAll("( )+"," ").trim();

        String[] str = num.split(" ");

        for (int i = 0; i < str.length - 1; i++) {
            if(Integer.parseInt(str[i]) >= Integer.parseInt(str[i + 1])){
                return false;
            }
        }
        return true;
    }
}