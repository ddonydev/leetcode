class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i].charAt(0))){
               arr[i] += "ma"; 
            }else{
                char tmp = arr[i].charAt(0);
                arr[i] = arr[i].substring(1);
                arr[i] += tmp + "ma";
            }
            for(int j = 0; j <= i; j++){
                arr[i] += "a";
            }
        }
        return String.join(" ", arr);
    }
}