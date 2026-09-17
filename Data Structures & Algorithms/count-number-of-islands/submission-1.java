class Solution {
    private char[][] grid;
    private boolean[][] visited;
    private int m, n, res;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.visited = new boolean[m][n];
        this.res = 0;
        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(i,j);
                    res++;
                }
            }
        }

        return res;
    }

    private void dfs(int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0' || visited[i][j])  return;

        visited[i][j] = true;
        
        dfs(i+1, j);
        dfs(i, j + 1);
        dfs(i - 1, j);
        dfs(i, j - 1);

    }
}
