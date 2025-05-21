package ticTacToe;

public class Board {

    private final char[][] grids;
    private int movesCount;

    public Board() {
        grids = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grids[row][col] = '-';
            }
        }
        movesCount = 0;
    }

    public synchronized void makeMove(int row, int col, char symbol) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || grids[row][col] != '-') {
            throw new IllegalArgumentException("Invalid move!");
        }
        grids[row][col] = symbol;
        movesCount++;
    }

    public boolean isFull() {
        return movesCount == 9;
    }

    public boolean hasWinner() {

        for (int row = 0; row < 3; row++) {
            if (grids[row][0] != '-' && grids[row][0] == grids[row][1] && grids[row][1] == grids[row][2]) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (grids[0][col] != '-' && grids[col][0] == grids[col][1] && grids[col][1] == grids[col][2]) {
                return true;
            }
        }

        if (grids[0][0] != '-' && grids[0][0] == grids[1][1] && grids[1][1] == grids[2][2]) {
            return true;
        }

        return grids[0][2] != '-' && grids[0][2] == grids[1][1] && grids[1][1] == grids[2][0];
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(grids[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
