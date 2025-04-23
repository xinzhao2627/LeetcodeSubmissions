class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j){
            char si = s.charAt(i), sj = s.charAt(j);
            if (!Character.isLetterOrDigit(si)) i++;
            else if (!Character.isLetterOrDigit(sj)) j--;
            else {
                if (Character.toLowerCase(si) != Character.toLowerCase(sj)) return false;
                i ++;
                j --;
            }
        }


        return true;
    }
}