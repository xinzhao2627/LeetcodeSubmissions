class Solution {
    public int uniquePaths(int m, int n) {
        int[][] pa = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (j == 0 || i == 0) pa[i][j] = 1;
                else pa[i][j] = pa[i-1][j] + pa[i][j-1];
            }
        }


        return pa[m-1][n-1];
    }
}