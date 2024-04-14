import java.util.Scanner;
import java.lang.StringBuilder;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = (word1.length() >= word2.length())
            ? word1.length()
            : word2.length()
        ;
        String merged = "";
        StringBuilder sb = new StringBuilder(merged);
        for (int i = 0; i < length; i++){
            if (i < word1.length()){
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()){
                sb.append(word2.charAt(i));
            }
        }


        return sb.toString();

    }
}