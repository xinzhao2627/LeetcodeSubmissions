import java.util.*;
class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) return false;

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()){
            if (c == '['){
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            } else if (c == '('){
                stack.push(')');
            } else if (stack.isEmpty()){
                return false;
            } else if (stack.pop() != c){
                return false;
            }
        }

        return stack.isEmpty();
    }
}