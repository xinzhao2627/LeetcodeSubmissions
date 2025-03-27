class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()- 1;
        while (i < j){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            } else {
                if (Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(i))) return false;
                i++;
                j--;
            }
        }


        return true;
    }
}