public class minesweeper_529 {
    public static void main(String[] args) {

    }

    public char[][] updateBoard(char[][] board, int[] click) {
        char[][] new_board = new char[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[j].length; j++) {

            }
        }
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[i].length - 1; j++) {
                int count_mines = 0;
                if (board[i][j] == 'M') {
                    continue;
                } else {
                    if (board[i - 1][j - 1] == 'M') {
                        count_mines++;
                    }
                    if (board[i - 1][j] == 'M') {
                        count_mines++;
                    }
                    if (board[i - 1][j + 1] == 'M') {
                        count_mines++;
                    }
                    if (board[i][j - 1] == 'M') {
                        count_mines++;
                    }
                    if (board[i][j + 1] == 'M') {
                        count_mines++;
                    }
                    if (board[i + 1][j - 1] == 'M') {
                        count_mines++;
                    }
                    if (board[i + 1][j] == 'M') {
                        count_mines++;
                    }
                    if (board[i + 1][j + 1] == 'M') {
                        count_mines++;
                    }
                }
                if (count_mines != 0) {
                    board[i][j] = Character.forDigit(count_mines, 10);
                }
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            int count_mines = 0;
            if (board[0][j] == 'M') {
                continue;
            }
            if (j == 0) {
                if (board[0][j + 1] == 'M') {
                    count_mines++;
                }
                if (board[1][j] == 'M') {
                    count_mines++;
                }
                if (board[1][j + 1] == 'M') {
                    count_mines++;
                }
                if (count_mines != 0) {
                    board[0][j] = Character.forDigit(count_mines, 10);
                }
            }
            if (j == board[0].length - 1) {
                if (board[0][j - 1] == 'M') {
                    count_mines++;
                }
                if (board[1][j] == 'M') {
                    count_mines++;
                }
                if (board[1][j - 1] == 'M') {
                    count_mines++;
                }
                if (count_mines != 0) {
                    board[0][j] = Character.forDigit(count_mines, 10);
                }
            }
            if (j > 0 && j < board[0].length - 1) {
                if (board[0][j - 1] == 'M') {
                    count_mines++;
                }
                if (board[0][j + 1] == 'M') {
                    count_mines++;
                }
                if (board[1][j] == 'M') {
                    count_mines++;
                }
                if (board[1][j - 1] == 'M') {
                    count_mines++;
                }
                if (board[1][j + 1] == 'M') {
                    count_mines++;
                }
                if (count_mines != 0) {
                    board[0][j] = Character.forDigit(count_mines, 10);
                }
            }
        }
        int size = board[0].length;
        for (int j = 0; j < board[size - 1].length; j++) {
            int count_mines = 0;
            if (board[size - 1][j] == 'M') {
                continue;
            }
            if (j == 0) {
                if (board[size - 1][j + 1] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j + 1] == 'M') {
                    count_mines++;
                }
                if (count_mines != 0) {
                    board[size - 1][j] = Character.forDigit(count_mines, 10);
                }
            }
            if (j == board[0].length - 1) {
                if (board[size - 1][j - 1] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j - 1] == 'M') {
                    count_mines++;
                }
                if (count_mines != 0) {
                    board[size - 1][j] = Character.forDigit(count_mines, 10);
                }
            }
            if (j > 0 && j < board[size - 1].length - 1) {
                if (board[size - 1][j - 1] == 'M') {
                    count_mines++;
                }
                if (board[size - 1][j + 1] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j - 1] == 'M') {
                    count_mines++;
                }
                if (board[size - 2][j + 1] == 'M') {
                    count_mines++;
                }
                if (count_mines != 0) {
                    board[0][j] = Character.forDigit(count_mines, 10);
                }
            }
        }

        int row = click[0];
        int column = click[1];
        find_empty(board, new_board, click);
        return new_board;
    }

    public void find_empty(char[][] raw_board, char[][] board, int[] click) {
        int row = click[0];
        int column = click[1];
        if (board[row][column] == 'M') {
            board[row][column] = 'X';
            return;
        }
        if (row == 0) {
            if (column == 0) {
                if (board[row][column + 1] == 'E') {
                    board[row][column + 1] = 'B';
                    find_empty(board, new int[]{row, column + 1});
                } else {
                    if (board[row][column + 1] == 'M') {
                        board[row][column + 1] = ''
                    }
                }
            }
        }
        if ()

    }
}
