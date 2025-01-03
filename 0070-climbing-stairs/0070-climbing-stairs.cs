public class Solution {
    public int ClimbStairs(int n) {
        if (n <= 3) return n;
        int a = 1, b = 1;
        for (int i = 0; i < n; i++){
            int tmp = b;
            b = a;
            a+= tmp;
        }
        return b;
    }
}