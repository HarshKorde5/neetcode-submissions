class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] box = new int[9];

        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.')  continue;

                int val = board[row][col] - '1';

                if((rows[row] & (1 << val)) > 0)    return false;
                if((cols[col] & (1 << val)) > 0)    return false;
                if((box[(row/3)*3+(col/3)] & (1 << val)) > 0)   return false;


                rows[row] |= (1 << val);
                cols[col] |= (1 << val);
                box[(row/3)*3+(col/3)] |= (1 << val);
            }
        }

        return true;
    }
}
