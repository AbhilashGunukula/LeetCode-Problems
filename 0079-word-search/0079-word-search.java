class Solution {
    public boolean exist(char[][] board, String word) {
        int rowLength = board.length;
        int colLength = board[0].length;

        for(int i =0; i<rowLength; i++){
            for(int j =0; j<colLength; j++){
                if(backtrack(i, j, board, word, 0))
                return true;
            }
        }

        return false;
        
    }

    private boolean backtrack(int row, int col, char[][] board, String word, int index ){
        if(index >= word.length()) return true;

        if(row<0 || row>=board.length || col <0 || col>=board[0].length || word.charAt(index) != board[row][col]) return false;

        boolean ret = false;

        board[row][col] = '#';

        int[] rowOffsets = {0, 1, 0, -1};
        int[] colOffsets = {1, 0, -1, 0};

        for(int d=0; d<4; d++){
            ret = backtrack(row + rowOffsets[d],
                            col + colOffsets[d], board, word, index+1 );
            if(ret) break;
        }

        board[row][col] = word.charAt(index);
        return ret;

    }
}