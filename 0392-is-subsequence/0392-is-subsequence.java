class Solution {
    public boolean isSubsequence(String s, String t) {
        int last_index = 0;
        for (int i = 0; i < s.length(); i++){
            int x = t.indexOf(s.charAt(i), last_index);
            last_index = x+1;
            if (x == -1) return false;
        }
        return true;
    }
}