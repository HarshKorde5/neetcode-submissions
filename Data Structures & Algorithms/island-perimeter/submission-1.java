class Solution {
    private int[][] grid;
    private boolean[][] visited;
    private int rows, cols;

    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.visited = new boolean[rows][cols];

        //just to start from a cell which is guarrented to be connected
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    return dfs(i,j);
                }
            }
        }

        return 0;
    }

    private int dfs(int i, int j){
        if(i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == 0){
            return 1;
        }

        if(visited[i][j]){
            return 0;
        }

        visited[i][j] = true;

        return dfs(i-1,j) + dfs(i, j + 1) + dfs(i + 1, j) + dfs(i, j - 1);
    }
}