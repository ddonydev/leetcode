class Solution {
    public String replaceDigits(String s) {
        char[] arr = new char[27];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (char) (i + 96);
            map.put(String.valueOf(arr[i]), i);
        }

        String[] str = s.split("");
        for (int i = 0; i < str.length - 1; i += 2) {
            String a = str[i];
            int b = Integer.parseInt(str[i + 1]);

            int n = map.get(a);
            int sum = n + b;

            str[i + 1] = String.valueOf(arr[sum]);
        }
        
        return Arrays.stream(str).collect(Collectors.joining());
    }
}