class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() -1;

        while (i < j){
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(j));

            if (!Character.isLetterOrDigit(c1)){
                i++;
            } else if (!Character.isLetterOrDigit(c2)){
                j--;
            } else {
                if (c1 != c2) return false;
                i++;
                j--;
            }
        }


        return true;
    }
}