class Solution {
    public int distinctAverages(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }

        HashSet<Double> set = new HashSet<>();
        while(list.size() > 0){
            int min = 99999;
            int max = 0;
            for(int i = 0; i < list.size(); i++){
                min = Math.min(min, list.get(i));
                max = Math.max(max, list.get(i));
            }

            list.remove(list.indexOf(min));
            list.remove(list.indexOf(max));

            set.add((min + max) / 2.0);
        }
        
        return set.size();
    }
}