import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = s.length() - 1;
        System.out.println(s);
        while (i < j){
            char a = s.charAt(i++), b = s.charAt(j--);
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
        }
        return true;
    }
}