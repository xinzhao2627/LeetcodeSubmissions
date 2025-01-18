class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() -1;
        while (i < j){
            char l = Character.toUpperCase(s.charAt(i)), r = Character.toUpperCase(s.charAt(j));
            if (!Character.isLetterOrDigit(l)) {
                i++;
                continue;
            } else if (!Character.isLetterOrDigit(r)){
                j--;
                continue;
            } else if (l != r) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}