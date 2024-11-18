import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j){
            char a = s.charAt(i), b = s.charAt(j);
            if (!Character.isLetterOrDigit(a)) i++;
            else if (!Character.isLetterOrDigit(b)) j--;
            else {
                if (Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}