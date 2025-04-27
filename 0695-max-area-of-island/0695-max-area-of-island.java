class Pair{
    int first;
    int last;
    public Pair(int first, int last){
        this.first = first;
        this.last = last;
    }
}

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxIsland = 0;

        int vis[][] = new int[m][n];
        //int cnt = 0;

        for(int row = 0; row<m; row++){
            for(int col = 0; col<n; col++){
                if(vis[row][col]== 0 && grid[row][col]==1){
                    //cnt++;
                  maxIsland= Math.max(maxIsland,  bfs(row, col, vis, grid));
                }
            }
        }
        return maxIsland;
        
    }

    public int bfs(int row, int col, int[][] vis, int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<Pair>();
        vis[row][col] = 1;
        q.add(new Pair(row,col));

        int[] deltaRow = {-1, 1, 0, 0};
        int[] deltaCol = {0, 0, -1, 1};
        int islandLength = 0;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int newRow = curr.first;
            int newCol = curr.last;

            islandLength++;


            for (int d = 0; d < 4; d++) {
                int i = newRow + deltaRow[d];
                int j = newCol + deltaCol[d];

                if (i >= 0 && i < m && j >= 0 && j < n && vis[i][j] == 0 && grid[i][j] == 1) {
                    vis[i][j] = 1;  // Mark as visited
                    q.add(new Pair(i, j));
                    
                }
            }

        }

        return islandLength;
    }
}
