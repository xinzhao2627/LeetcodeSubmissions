public class Solution {
    int[][] directions = new int[][] {
    new int[] {1,0},
    new int[] {0,1},
    new int[] {-1,0},
    new int[] {0,-1},
    };

    public void Bfs(int r, int c, int r_len, int c_len, char[][] grid){
        Queue<int[]> q = new Queue<int[]>();
        q.Enqueue(new int[] {r,c});
        grid[r][c] = '0';
        while (q.Count() > 0){
            int[] p = q.Dequeue();

            foreach (int[] d in directions){
                int targ_r = d[0] + p[0];
                int targ_c = d[1] + p[1];

                if (targ_r >= 0 && targ_c >= 0 && targ_r < r_len && targ_c < c_len && grid[targ_r][targ_c] == '1'){
                    q.Enqueue(new int[ ] {targ_r, targ_c});
                    grid[targ_r][targ_c] = '0';
                }

            }

        }
    }


    public int NumIslands(char[][] grid) {
        int c_len = grid[0].Length;
        int r_len = grid.Length;
        int res = 0;
        for (int r = 0; r < r_len; r++){
            for (int c = 0; c < c_len; c++){
                if (grid[r][c] == '1'){
                    res++;
                    Bfs(r, c, r_len, c_len, grid);
                }
            }
        }
        return res;
    }
}