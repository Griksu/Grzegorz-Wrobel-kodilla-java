package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuBoard board = new SudokuBoard();
            board.demo();
            //gameFinished = resolveSudoku(board);
        }
    }

    /*private static boolean resolveSudoku(SudokuBoard board) {
        if () {
            return true;
        } else {
            return false;
        }
    }*/

}
