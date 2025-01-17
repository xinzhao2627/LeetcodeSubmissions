public class Solution {
    public bool IsValid(string s) {
        Stack cs = new Stack();

        foreach (char c in s.ToCharArray()){
            if (c == '{') cs.Push('}');
            else if (c == '(') cs.Push(')');
            else if (c == '[') cs.Push(']');
            else if (cs.Count > 0 && c != (char)cs.Pop()) return false;
        }
        return cs.Count == 0;
    }
}