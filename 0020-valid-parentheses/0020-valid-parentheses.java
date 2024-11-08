import java.util.*;
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop() ) return false;
        }
        // if there are still parentheses, false.. completed if true
        return stack.isEmpty();
    }
}