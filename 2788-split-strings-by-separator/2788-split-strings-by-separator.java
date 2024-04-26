class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.size(); i++){
            String[] arr = words.get(i).split("\\"+separator);
            for(int j = 0; j < arr.length; j++){
                if(!arr[j].equals("")){
                    list.add(arr[j]);
                }
            }
        }
        
        return list;
    }
}