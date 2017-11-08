/*
 * Assignment: Chapter 07
 * Name: Nusrat sharmin
 * Filename: Classroom.java
 */
import java.util.Arrays;

public class Classroom {

    private String[][] desks;

    public Classroom(int row, int column) {
        this.desks = new String[row][column];

        for (int r = 0; r < row; r++) {
            Arrays.fill(this.desks[r], "");

        }
    }

    public String getRow(int row) {
        this.checkRowValue(row - 1);
        return Arrays.toString(this.desks[row - 1]);

    }

    public String getStudent(int row, int column) {
        this.checkRowValue(row - 1);
        this.checkColumnValue(column - 1);
        return this.desks[row - 1][column - 1];
    }

    public boolean isDeskTaken(int row, int column) {
        this.checkRowValue(row - 1);
        this.checkColumnValue(column - 1);
        boolean taken = false;
        if (!desks[row -1][column -1].isEmpty()) {
            taken = true;
        }
        return taken;
    }

    public boolean placeStudent(int row, int column, String name) {
        this.checkRowValue(row - 1);
        this.checkColumnValue(column - 1);
        boolean placed = false;
        if (!this.isDeskTaken(row, column)) {
            desks[row -1][column -1] = name;
            placed = true;
        }
        return placed;
    }

    private void checkRowValue(int row) {
        if (row > desks.length) {
            throw new IllegalArgumentException("row [" + row + "] is too high.");
        }

        if (row < 0) {
            throw new IllegalArgumentException("row [" + row + "] is too low.");
        }
    }

    private void checkColumnValue(int column) {
        if (column > desks[0].length) {
            throw new IllegalArgumentException("column [" + column + "] is too high.");
        }

        if (column < 0) {
            throw new IllegalArgumentException("column [" + column + "] is too low.");
        }
    }
}
