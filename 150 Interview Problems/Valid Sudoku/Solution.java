class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        for (int i = 0; i < N; i++) {
            boolean[] rowCheck = new boolean[N];
            boolean[] colCheck = new boolean[N];

            for (int j = 0; j < N; j++) {
                if (board[i][j] != '.') {
                    int rowIndex = board[i][j] - '1';
                    if (rowCheck[rowIndex]) return false;
                    rowCheck[rowIndex] = true;
                }

                if (board[j][i] != '.') {
                    int colIndex = board[j][i] - '1';
                    if (colCheck[colIndex]) return false;
                    colCheck[colIndex] = true;
                }
            }
        }

        for (int i = 0; i < N; i += 3) {
            for (int j = 0; j < N; j += 3) {
                boolean[] subgridCheck = new boolean[N];

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] != '.') {
                            int subgridIndex = board[x][y] - '1';
                            if (subgridCheck[subgridIndex]) return false;
                            subgridCheck[subgridIndex] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}
