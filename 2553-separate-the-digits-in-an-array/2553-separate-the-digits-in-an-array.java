class Solution {
    public int[] separateDigits(int[] nums) {
        String[] num = Arrays.stream(nums).mapToObj(String::valueOf)
                        .toArray(String[]::new);


        ArrayList<String> list = new ArrayList<>();
        for (String n : num) {
            String[] split = n.split("");
            for (String str : split) {
                list.add(str);
            }
        }

        return list.stream().mapToInt(Integer::parseInt).toArray();
    }
}