class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int one = (int) Arrays.stream(s.split(""))
            .mapToInt(Integer::parseInt).filter(i -> i == 1).count();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < one; i++){
            sb.append("1");
        }

        for(int i = one; i < s.length(); i++){
            sb.append("0");
        }

        sb.append("1");
        
        return sb.toString();
        
    }
}