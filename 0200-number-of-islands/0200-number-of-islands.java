class Solution {
    int r;
    int c;
    // i is row index, j is column index
    public void recursion(int i, int j, char[][] grid){
        if (i-1 > 0 && grid[i-1][j] == '1'){
            grid[i-1][j] = '0';
            recursion(i-1, j, grid);
        } 
        if (i+1 < r && grid[i+1][j] == '1'){
            grid[i+1][j] = '0';
            recursion(i+1, j, grid);
        }
        if (j-1 > 0 && grid[i][j-1] == '1'){
            grid[i][j-1] = '0';
            recursion(i, j-1, grid);
        }
        if (j+1 < c && grid[i][j+1] == '1'){
            grid[i][j+1] = '0';
            recursion(i, j+1, grid);
        }
        return;
        
    }
    public int numIslands(char[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int count = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (grid[i][j] == '1'){
                    count++;
                    grid[i][j] = '0';
                    recursion(i, j, grid);
                }
            }
        }
        return count;
    }
}