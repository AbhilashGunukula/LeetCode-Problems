class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int initcol = image[sr][sc];
        int[][] ans = image;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, +1, 0, -1};
        dfs(sr, sc, color, initcol, ans, image, delrow, delcol);
        return ans;
 
    }

    public void dfs(int row, int col, int color,
    int initcol, int[][] ans, int[][] image, int[] delrow, int[] delcol ){

        ans[row][col] = color;
        int rowlen = image.length;
        int collen = image[0].length;

        for(int i = 0; i<4; i++){
            int filrow = row + delrow[i];
            int filcol = col + delcol[i];
            if(filrow>=0 && filrow<rowlen && filcol >= 0 && filcol < collen && image[filrow][filcol]==initcol && ans[filrow][filcol] != color){
                dfs(filrow, filcol, color, initcol, ans, image, delrow, delcol);
            }
        }


    }
}