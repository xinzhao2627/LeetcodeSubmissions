class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(') stack.add(')');
            else if (c == '[') stack.add(']');
            else if (c == '{') stack.add('}');

            else {
                if (stack.isEmpty()) return false;
                if (stack.pop() != c) return false;
            }
        }
        return stack.isEmpty();
    }
}