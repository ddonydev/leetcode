class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];

        for (String value : arr) {
            int index = Integer.parseInt(value.replaceAll("[^0-9]", "")) - 1;
            result[index] = value.replaceAll("[0-9]", "");
        }
        return String.join(" ", result);
    }
}