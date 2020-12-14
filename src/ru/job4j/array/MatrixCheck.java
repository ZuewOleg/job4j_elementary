package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i < board.length - 1; i++) {
            for (int j = 0; j < board.length - 1; j++) {
                if (board[row][j] != board[row][j + 1]) {
                    result = false;
                    break;
                }
            }
        }
            return result;
        }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = column; j < board.length - 1; j++) {
                if (board[i][column] != board[i + 1][column]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
                rsl[i] = board[i][i];
            }
        return rsl;
        }
  }
