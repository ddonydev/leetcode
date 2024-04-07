class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length == 1){
            return 1;
        }
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                      ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                      "..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String, String> map = new HashMap<>();
        char alphabet = 'a';
        for(String str : s){
            map.put(String.valueOf(alphabet), str);
            alphabet++;
        }
        
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String[] tmp = words[i].split("");
            String result = "";
            for(int j = 0; j < tmp.length; j++){
                result += map.get(tmp[j]);
            }
            
            list.add(result);
        }
        
        return (int) list.stream().distinct().count();
        
        
    }
}