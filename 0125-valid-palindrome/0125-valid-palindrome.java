class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()- 1;
        while (i < j){
            char si  =s.charAt(i);
            char sj = s.charAt(j);
            if (!Character.isLetterOrDigit(si)){
                i++;
            } else if (!Character.isLetterOrDigit(sj)){
                j--;
            } else {
                if (Character.toLowerCase(sj) != Character.toLowerCase(si)) return false;
                i++;
                j--;
            }
        }


        return true;
    }
}