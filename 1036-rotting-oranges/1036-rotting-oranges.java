class Pair{
    int row;
    int col;
    int t;
    public Pair(int row, int col, int t){
        this.row = row;
        this.col = col;
        this.t = t;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {

        int rowlen = grid.length;
        int collen = grid[0].length;

        int[][] vis = new int[rowlen][collen];
        Queue<Pair> q = new LinkedList<>();
        int cntfresh =0;

        for(int i =0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else{
                    vis[i][j] = 0;
                }

                if(grid[i][j]==1) cntfresh++;
            }
        }

        int tm = 0;
    // delta row and delta column
    int drow[] = {-1, 0, +1, 0};
    int dcol[] = {0, 1, 0, -1}; 
    int cnt = 0;

        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int time = q.peek().t;
            tm = Math.max(tm, time);

            q.remove();
      // exactly 4 neighbours
      for (int i = 0; i < 4; i++) {
        int nrow = r + drow[i];
        int ncol = c + dcol[i];
        // check for valid coordinates and 
        // then for unvisited fresh orange
        if (nrow >= 0 && nrow < rowlen && ncol >= 0 && ncol < collen &&
          vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
          // push in queue with timer increased
          q.add(new Pair(nrow, ncol, time + 1));
          // mark as rotten
          vis[nrow][ncol] = 2;
          cnt++;
        }
      }
    }

    if (cnt != cntfresh) return -1;
    return tm;


        }
        
    
}