import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        int middle = s.length()/2;
        String vowels = "aeiou";
        StringBuilder str = new StringBuilder(s);
        while (i < j && j > i){
            char start_char = Character.toLowerCase(s.charAt(i));
            char end_char = Character.toLowerCase(s.charAt(j));
            int sv = vowels.indexOf(start_char);
            int ev = vowels.indexOf(end_char);
            if (sv != -1 && ev != -1){ // if at i and j is a vowel
                str.setCharAt(i, s.charAt(j));
                str.setCharAt(j, s.charAt(i));
                i++;
                j--;
            } else if (ev != -1){
                i++;
            } else if (sv != -1){
                j--;
            } else {
                i++;
                j--;
            }
        }
        return str.toString();
    }
}