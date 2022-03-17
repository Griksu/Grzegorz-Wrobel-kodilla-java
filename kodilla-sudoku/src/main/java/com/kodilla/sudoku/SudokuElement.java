package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static final int EMPTY = -1;
    private int value;
    private List<Integer> availableValues = new ArrayList<>();

    public SudokuElement() {
        for (int n = 1; n < 10; n++) {
            availableValues.add(n);
        }
        value = EMPTY;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getAvailableValues() {
        return availableValues;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return (value != EMPTY) ? "" + value : "_";
    }
}
