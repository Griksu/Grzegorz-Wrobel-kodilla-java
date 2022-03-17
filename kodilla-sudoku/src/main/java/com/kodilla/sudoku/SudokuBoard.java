package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for (int n = 0; n < 9; n++) {
            rows.add(new SudokuRow());
        }
    }

    public SudokuElement getSudokuElement(int col, int row) {
        return rows.get(row).getColumns().get(col);
    }

    public void setSudokuElement(int col, int row, int value) {
        rows.get(row).getColumns().get(col).setValue(value);
    }

    public void demo() {
        setSudokuElement(0, 0, 2);
        setSudokuElement(3, 0, 6);
        setSudokuElement(5, 0, 7);
        setSudokuElement(6, 0, 5);
        setSudokuElement(7, 1, 9);
        setSudokuElement(8, 1, 6);
        setSudokuElement(0, 2, 6);
        setSudokuElement(2, 2, 7);
        setSudokuElement(5, 2, 1);
        setSudokuElement(6, 2, 3);
        setSudokuElement(1, 3, 5);

    }

    @Override
    public String toString() {
        String s = "------------------------\n";
        for (int row = 0; row < 9; row++) {
            s += rows.get(row).toString();
        }
        s += "------------------------\n";
        return s;
    }
}
