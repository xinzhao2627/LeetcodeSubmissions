import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!Character.isLetterOrDigit(c1)) i++;
            else if (!Character.isLetterOrDigit(c2)) j--;
            else {
                if (c1 != c2) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}