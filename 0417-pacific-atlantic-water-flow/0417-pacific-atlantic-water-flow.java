class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        if(heights == null || heights.length == 0 || heights[0].length == 0){
            return new ArrayList<>();
        }

        int m = heights.length; int n = heights[0].length;

        int [][] directions = {{-1,0},{1,0},{0,-1},{0,1}};

        boolean [][] pacificOcean = new boolean[m][n];
        boolean [][] atlanticOcean = new boolean[m][n];

        for(int i = 0; i<m; i++){
            dfs(heights, directions, i, 0, pacificOcean);
            dfs(heights, directions, i, n-1, atlanticOcean);
        }

        for(int i = 0; i<n; i++){
            dfs(heights, directions, 0, i, pacificOcean);
            dfs(heights, directions, m-1, i, atlanticOcean);
        }

        List<List<Integer>> res = new ArrayList<>();

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(pacificOcean[i][j] && atlanticOcean[i][j]){
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    res.add(cell);
                }
            }
        }

        return res;
        
    }

    public void dfs(int[][] heights, int[][] directions, int r, int c, boolean[][] reachable){
        reachable[r][c] = true;

        int m = heights.length, n = heights[0].length;
        for(int[] direction : directions){
            int nr = direction[0] + r;
            int nc =  direction[1] + c;

            if(nr>=0 && nr < m && nc>=0 && nc < n && !reachable[nr][nc] && heights[nr][nc] >= heights[r][c]){
                dfs(heights, directions, nr, nc, reachable);
            }
        }
    }
}