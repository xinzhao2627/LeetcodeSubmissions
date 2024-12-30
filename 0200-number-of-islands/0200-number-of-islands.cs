public class Solution {
    public void bfs(char[][] grid, int r_len, int c_len, int i , int j){
        grid[i][j] = '0';
        Queue<int[]> q = new Queue<int[]>();
        q.Enqueue(new int[] {i, j});
        
        int[][] directions = new int [][]{
            new int[] {1,0},
            new int[] {0,1},
            new int[] {-1,0},
            new int[] {0,-1}
        };

        while (q.Count() > 0){
            int[] point = q.Dequeue();
            foreach(int[] direction in directions){
                int r  = point[0] + direction[0];
                int c = point[1] + direction[1];

                if (r >= 0 && c >= 0 && r < r_len && c < c_len && grid[r][c] != '0'){
                    q.Enqueue(new int[] {r, c});
                    grid[r][c] = '0';
                }
            } 
        }
    }
    public int NumIslands(char[][] grid) {
        int r_len = grid.Length;
        int c_len = grid[0].Length;
        int res = 0;
        for (int i = 0; i < r_len; i++){
            for (int j = 0; j < c_len; j++){
                if (grid[i][j] == '1'){
                    bfs(grid, r_len, c_len, i, j);
                    res++;
                }
            }
        }
        return res;
    }
}