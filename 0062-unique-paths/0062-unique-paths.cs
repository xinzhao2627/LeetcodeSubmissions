public class Solution {
    public int UniquePaths(int m, int n) {
        int[,] grid = new int[m,n];

        for (int r = 0; r < m; r++){
            for (int c = 0; c < n; c++){
                grid[r,c] = (r > 0 && c > 0) ? grid[r-1, c] + grid[r, c-1] : 1; 
            }
        }
        return grid[m-1,n-1];
    }
}