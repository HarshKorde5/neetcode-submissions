class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rowMap = new HashMap<>();
        Map<Integer, Set<Integer>> colMap = new HashMap<>();
        Map<Integer, Set<Integer>> boxMap = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int ch = board[row][col];
                if (ch == 46)
                    continue;
                ch -= 48;
                int boxIdx = (row / 3) * 3 + (col / 3);

                Set<Integer> rowSet = rowMap.computeIfAbsent(row, k -> new HashSet<>());
                Set<Integer> colSet = colMap.computeIfAbsent(col, k -> new HashSet<>());
                Set<Integer> boxSet = boxMap.computeIfAbsent(boxIdx, k -> new HashSet<>());

                if (!rowSet.add(ch))
                    return false;
                if (!colSet.add(ch))
                    return false;
                if (!boxSet.add(ch))
                    return false;
            }
        }

        return true;
    }
}
