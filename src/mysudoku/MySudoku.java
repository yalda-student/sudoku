package mysudoku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yalda
 */
public enum MySudoku {
    ONE(new int[][]{
        {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0},
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0}}),
    TWO(new int[][]{
        {8, 0, 2, 7, 0, 0, 4, 0, 0},
        {0, 1, 0, 0, 0, 9, 0, 0, 5},
        {0, 4, 0, 0, 8, 0, 2, 0, 0},
        {0, 0, 0, 0, 5, 0, 9, 2, 0},
        {0, 0, 0, 8, 0, 7, 0, 0, 6},
        {7, 0, 9, 0, 6, 0, 0, 5, 0},
        {0, 0, 3, 0, 0, 5, 7, 0, 9},
        {6, 0, 0, 0, 1, 0, 3, 0, 0},
        {4, 0, 0, 2, 0, 0, 0, 0, 8}});

    private int[][] sudokuArray = new int[9][9];

    private MySudoku(int[][] sudokuArray) {
        this.sudokuArray = sudokuArray;
    }

    public int[][] getSudokuArray() {
        return sudokuArray;
    }

    public void setSudokuArray(int[][] sudokuArray) {
        this.sudokuArray = sudokuArray;
    }

}
