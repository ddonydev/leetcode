class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        String[] str = new String[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            str[i] = Integer.toBinaryString(i);
        }

        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            String[] s = str[i].split("");
            int cnt = 0;
            for (int j = 0; j < s.length; j++) {
                cnt += Integer.parseInt(s[j]);
            }
            if (cnt == k) {
                answer += nums.get(i);
            }
        }
        return answer;
    }
}