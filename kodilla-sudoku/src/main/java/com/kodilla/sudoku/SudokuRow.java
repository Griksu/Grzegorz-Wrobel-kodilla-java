package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> columns = new ArrayList<>();

    public SudokuRow() {
        for (int n = 0; n < 9; n++) {
            columns.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int column = 0; column < 9; column++) {
            s += columns.get(column) + "|";
        }
        return s + "\n";
    }
}
