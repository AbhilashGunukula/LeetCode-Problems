class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for(int i =0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();

        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];

                 if (c == '.') {
                    continue;
                }

                if(row[i].contains(c)) return false;
                row[i].add(c);

                if(col[j].contains(c)) return false;
                col[j].add(c);

                int curBox = (i/3)*3 + (j/3);

                if(box[curBox].contains(c)) return false;
                box[curBox].add(c);
            }
        }

        return true;

        
    }
}