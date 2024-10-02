class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(copyArr);
        int n = 1;
        for(int i = 0; i < copyArr.length; i++){
            if(map.containsKey(copyArr[i])){
                continue;
            }
            map.put(copyArr[i], n++);
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        
        return arr;
        
    }
}