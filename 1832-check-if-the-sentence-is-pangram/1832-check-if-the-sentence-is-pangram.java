class Solution {
    public boolean checkIfPangram(String sentence) {
        String[] s = sentence.split("");

        Set<String> set = new HashSet<String>();
        for (String str : s) {
            set.add(str);
        }

        if (set.size() != 26) {
            return false;
        }
        return true;
    }
}