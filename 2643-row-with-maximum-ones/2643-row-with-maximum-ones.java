class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < mat.length; i++){
            map.put(i, 0);
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    map.put(i, map.get(i) + 1);
                }
            }
        }
        
        int index = 0;
        int cnt = 0;
        for(int i = 0; i < mat.length; i++){
            if(cnt < map.get(i)){
                cnt = map.get(i);
                index = i;
            }            
        }
        
        return new int[]{index, cnt};
    }
}