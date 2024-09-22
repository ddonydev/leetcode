class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0; i < paths.size(); i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        
        String destination = paths.get(0).get(0);

        while(map.get(destination) != null){
            destination = map.get(destination);
        }
        return destination;
    }
}