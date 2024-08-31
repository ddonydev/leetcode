class Solution {
    public int splitNum(int num) {
        String s = String.valueOf(num);
        String[] str = s.split("");
        Arrays.sort(str);
        
        int index = 0;
        String n1 = "";
        String n2 = "";
        while(index < str.length){
            n1 += str[index++];
            if(index < str.length){
                n2 += str[index++];
            }
        }
        
        return Integer.parseInt(n1) + Integer.parseInt(n2);
    }
}