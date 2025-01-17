public class Solution {
    int[][] directions = new int[][]{
        new int[] {1,0},
        new int[] {0,1},
        new int[] {-1, 0},
        new int[] {0, -1}
    };
    public void Bfs(int i, int j, char[][] grid, int r_len, int c_len){
        Queue<int[]> q = new Queue<int[]>();
        grid[i][j] = '0';
        q.Enqueue(new int[]{i,j});
        
        while (q.Count() > 0){
            int[] point = q.Dequeue();
            foreach(int[] direction in directions){
                int r = direction[0] + point[0];
                int c = direction[1] + point[1];

                if (r >= 0 && c >= 0 && r < r_len && c < c_len && grid[r][c] == '1'){
                    q.Enqueue(new int[] {r, c});
                    grid[r][c] = '0';
                }
            }

        }
    } 

    public int NumIslands(char[][] grid) {

        int res = 0;
        int r_len = grid.Length;
        int c_len = grid[0].Length;

        for (int i = 0; i < r_len; i++){
            for (int j = 0; j < c_len; j++){
                if (grid[i][j] == '1'){
                    res++;
                    Bfs(i, j, grid, r_len, c_len);
                }
            }
        }
        return res;
    }
}