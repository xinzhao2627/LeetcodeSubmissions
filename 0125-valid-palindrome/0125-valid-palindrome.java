class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() -1;

        while (i < j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);

            if (!Character.isLetterOrDigit(ci)){
                i++;
            } else if (!Character.isLetterOrDigit(cj)){
                j--;
            } else {
                if (ci != cj){
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}