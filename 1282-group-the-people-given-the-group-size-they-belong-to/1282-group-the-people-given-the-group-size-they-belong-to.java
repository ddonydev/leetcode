class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < groupSizes.length; i++){
            List<Integer> list = new ArrayList<>();
            if(set.contains(i)){
                continue;
            }
            list.add(i);
            set.add(i);
            for(int j = 0; j < groupSizes.length; j++){
                if(i != j && list.size() < groupSizes[i] 
                   && !set.contains(j) && groupSizes[i] == groupSizes[j]){
                    list.add(j);
                    set.add(j);
                }
            }
            answer.add(list);
        }
        
        return answer;
    }
}