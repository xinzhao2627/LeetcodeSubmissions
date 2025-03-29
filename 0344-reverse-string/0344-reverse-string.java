class Solution {
    public void rev(int i, int j, char[] s){
        if (i > j) return;
        char tmp = s[i];
        s[i] = s[j]; 
        s[j] = tmp;
        rev(i+1, j-1, s);
    }
    public void reverseString(char[] s) {
        rev(0, s.length-1, s);
    }
}