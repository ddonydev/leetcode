class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);

        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            while(tmp > 0){
                arr[i] = Math.max(arr[i], tmp % 10);
                tmp /= 10;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) >= 2){
                max = Math.max(max, key);
            }
        }
        
        if(max == 0){
            return -1;
        }

        int answer = 0;
        for (Integer key : map.keySet()) {
            int cnt = 2;
            int sum = 0;
            if(map.get(key) >= 2){
                for (int i = arr.length - 1; i >= 0; i--) {
                    if(cnt > 0 && arr[i] == key){
                        sum += nums[i];
                        cnt--;
                    }
                }
            }
            answer = Math.max(answer, sum);
        }
        
        if(answer == 0){
            return -1;
        }
        
        return answer;
    }
}