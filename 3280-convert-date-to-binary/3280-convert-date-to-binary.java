class Solution {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        String year = Integer.toBinaryString(Integer.parseInt(str[0]));
        String month = Integer.toBinaryString(Integer.parseInt(str[1]));
        String day = Integer.toBinaryString(Integer.parseInt(str[2]));
        return year + "-" + month + "-" + day;
    }
}