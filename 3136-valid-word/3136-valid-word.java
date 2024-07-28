class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        int letter = 0;
        int digit = 1;
        int vowel = 0;
        int consonant = 0;

        for(int i = 0;i < word.length(); i++){
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
            }
            else if (Character.isLetter(ch)) {
                letter++;
            }
            else if (Character.isDigit(ch)) {
                digit++;
            }
            else
            {
                consonant++;
            }
        }
        if(letter > 0 && digit > 0 && vowel > 0 && consonant == 0){
            return true;
        }
        return false;
        
        
    }
}