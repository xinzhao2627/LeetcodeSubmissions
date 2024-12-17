class Solution {
    public void bfs(int r, int c, char[][]grid, int[][] directions, int r_len, int c_len){
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[] {r, c});
        while (!q.isEmpty()){
            int[] point = q.poll();

            for (int[] direction : directions){
                int nr = point[0] + direction[0], nc = point[1]+direction[1];

                if (nr < r_len && nr >=0 && 
                    nc < c_len && nc >= 0 && 
                    grid[nr][nc] == '1'){
                    
                        q.add(new int[] {nr, nc});
                        grid[nr][nc] = '0';
                }
            } 
        }
    }

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int islands = 0;
        int r_len = grid.length;
        int c_len = grid[0].length;

        // direction: {up, down, left, right}
        int[][] directions = {{1,0}, {-1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < r_len; i++){
            for (int j = 0; j < c_len; j++){
                if (grid[i][j] != '0'){
                    bfs(i, j, grid, directions, r_len, c_len);
                    islands++;
                }
            }
        }

        return islands;
    }
}