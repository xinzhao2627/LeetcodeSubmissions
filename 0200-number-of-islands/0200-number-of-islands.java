class Solution {
    public void bfs(int r, int c, char[][]grid, HashSet<String> visited, int[][] directions, int r_len, int c_len){
        Queue<int[]> q = new LinkedList<>();
        visited.add(r+","+c);
        q.add(new int[] {r, c});
        while (!q.isEmpty()){
            int[] point = q.poll();

            for (int[] direction : directions){
                int nr = point[0] + direction[0], nc = point[1]+direction[1];

                if (nr < r_len && nr >=0 && 
                    nc < c_len && nc >= 0 && 
                    grid[nr][nc] == '1' && 
                    !visited.contains(nr+","+nc)){
                    
                        q.add(new int[] {nr, nc});
                        visited.add(nr+","+nc);
                }
            } 
        }
    }

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        HashSet<String> visited = new HashSet<>();
        int islands = 0;
        int r_len = grid.length;
        int c_len = grid[0].length;

        // direction: {up, down, left, right}
        int[][] directions = {{1,0}, {-1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < r_len; i++){
            for (int j = 0; j < c_len; j++){
                if (grid[i][j] != '0' && !visited.contains(i+","+j)){
                    bfs(i, j, grid, visited, directions, r_len, c_len);
                    islands++;
                }
            }
        }

        return islands;
    }
}