class Solution {
    public void solve(char[][] board) {

        int m = board.length; int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int i =0 ; i<m; i++){
            if(!visited[i][0] && board[i][0] == 'O')
            dfs(board, directions, visited, i, 0);

            if(!visited[i][n-1]&& board[i][n-1] == 'O')
            dfs(board, directions, visited, i, n-1);
        }

        for(int i =0 ; i<n; i++){
            if(!visited[0][i] && board[0][i] == 'O')
            dfs(board, directions, visited, 0, i);

            if(!visited[m-1][i] && board[m-1][i] == 'O')
            dfs(board, directions, visited, m-1, i);
        }

        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }

            }
        }
        
    }

    private void dfs(char[][] board, int[][] directions, boolean[][] visited, int r, int c){

        visited[r][c] = true;

        int m = board.length; int n = board[0].length;

        for(int[] direction : directions){
            int nr = r + direction[0];
            int nc = c + direction[1];

            if(nr>=0 && nr<m && nc>=0 && nc<n && !visited[nr][nc] && board[nr][nc] == 'O'){
                dfs(board, directions, visited, nr, nc);
            }


        }

    }
}