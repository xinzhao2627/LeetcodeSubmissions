class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '{') a.push('}');
            else if (c == '[') a.push(']');
            else if (c == '(') a.push(')');
            else if (a.isEmpty() || c != a.pop()) return false;
        }
        return a.isEmpty();
    }
}