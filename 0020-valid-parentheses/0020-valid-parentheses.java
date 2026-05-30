class Solution {
    public boolean isValid(String s) {
        Stack<Character> balance = new Stack<>();

        for (char c : s.toCharArray()){
            try {
                if (c == '('){
                    balance.push(')');
                } else if (c == '[') {
                    balance.push(']');
                } else if (c == '{') {
                    balance.push('}');

                } else {
                    char popped = balance.pop();
                    if (popped != c) {
                        return false;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        return balance.size() > 0 ? false : true;
    }
}