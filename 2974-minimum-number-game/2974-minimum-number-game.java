class Solution {
    public int[] numberGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list);

        int[] answer = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        int index = 0;
        while (list.size() > 1) {
            int x = list.get(0);
            int y = list.get(1);
            stack.push(list.get(0));
            stack.push(list.get(1));

            for (int i = 0; i <= stack.size(); i++) {
                answer[index] = stack.pop();
                index++;
            }
            list.remove(Integer.valueOf(x));
            list.remove(Integer.valueOf(y));
        }
        
        return answer;
    }
}