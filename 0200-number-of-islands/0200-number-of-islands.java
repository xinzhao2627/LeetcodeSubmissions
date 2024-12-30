class Solution {
    public void bfs(int r, int c, int r_len, int c_len, char[][] grid){
        int[][] directions = new int[][] {{0,-1}, {0,1}, {1,0}, {-1,0}};
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[] {r, c});
        while (!q.isEmpty()){
            int[] point = q.poll();
            for (int[] dir : directions){
                int locr = point[0]+dir[0];
                int locc = point[1]+dir[1];

                if (locc < c_len && locr < r_len && locc > -1 && locr > -1
                    && grid[locr][locc] == '1'
                ){
                    q.add(new int[] {locr, locc});
                    grid[locr][locc] = '0';
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int ni = 0;
        int r_len = grid.length;
        int c_len = grid[0].length;
        for (int r = 0; r < r_len; r++){
            for (int c = 0; c < c_len; c++){
                if (grid[r][c] != '0'){
                    bfs(r, c, r_len, c_len, grid);
                    ni++;
                }
            }
        }
        return ni;
    }

}