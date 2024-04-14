import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] words_list = s.trim().split("\\s+");
        StringBuilder output = new StringBuilder();
        for (int i = words_list.length - 1; i >= 0; i--){
            output.append( (i == 0) ? words_list[i] : words_list[i] + " ");
        }
        return output.toString();
    }
}