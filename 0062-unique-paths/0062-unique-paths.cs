public class Solution {
    public int UniquePaths(int m, int n) {
        var grid = new int [m,n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                grid[i, j] = (i > 0 && j > 0) ?  grid[i - 1, j] + grid[i, j-1] : 1;
            }
        }
        return grid[m-1, n-1];
    }
}