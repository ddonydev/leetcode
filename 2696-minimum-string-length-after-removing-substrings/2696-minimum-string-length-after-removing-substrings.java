class Solution {
    public int minLength(String s) {
        boolean flag = true;
        String str = s;
        while (flag != false) {
            if (str.contains("AB")) {
                str = str.replace("AB", "");
            } else if (str.contains("CD")) {
                str = str.replace("CD", "");
            } else {
                flag = false;
            }
        }
        return str.length();
    }
}