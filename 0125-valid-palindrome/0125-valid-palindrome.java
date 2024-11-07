import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return false;
        s = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j && j > i){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            } else return false;
        }
        return true;
    }
}