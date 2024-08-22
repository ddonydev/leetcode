class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);

        String s = "";
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                s += "0";
            }else{
                s += "1";
            }
        }
        
        return Integer.parseInt(s, 2);
    }
}