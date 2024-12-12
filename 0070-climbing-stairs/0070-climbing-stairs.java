class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        
        int a = 1, b = 1;

        for (int i = 0; i < n-1; i++){
            int tmp =  a;
            a = a+b;
            b = a;
        }
        return a;

    }
}