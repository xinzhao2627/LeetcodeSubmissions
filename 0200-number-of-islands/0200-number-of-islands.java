class Solution {
    int[][] directions = new int[][] {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };
    public void bfs(char[][] grid, int i, int j, int r, int c){
        Queue<int[]> queue = new LinkedList<>();
        grid[i][j] = '0';

        queue.add(new int[]{i, j});

        while (!queue.isEmpty()){
            int[] el = queue.remove();

            for (int[ ] d : directions){
                int nr = d[0] + el[0];
                int nc = d[1] + el[1];

                if (nr >= 0 && nc >= 0 && nr < r && nc < c && grid[nr][nc] == '1'){
                    grid[nr][nc] = '0';
                    queue.add(new int[] {nr, nc});
                }
            }
        } 

    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int res = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (grid[i][j] == '1'){
                    bfs(grid, i, j, r, c);
                    res++;
                }
            }
        }
        return res;
    }
}