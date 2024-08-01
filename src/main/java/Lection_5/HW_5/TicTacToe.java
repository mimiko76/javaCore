package Lection_5.HW_5;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Data
public class TicTacToe {
    private int[] board; // Массив для хранения состояния поля
    private static final int EMPTY = 0;
    private static final int CROSS = 1;
    private static final int NOUGHT = 2;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = CROSS; // Начинаем с крестика

        while (true) {
            displayBoard();
            System.out.println("Игрок " + (currentPlayer == CROSS ? "X" : "O") + ", введите позицию (0-8): ");
            int position = scanner.nextInt();

            if (!makeMove(position, currentPlayer)) {
                System.out.println("Неверный ход. Попробуйте снова.");
                continue;
            }

            int winner = checkWinner();
            if (winner != -1) {
                displayBoard();
                System.out.println("Игрок " + (winner == CROSS ? "X" : "O") + " выиграл!");
                break;
            }

            // Проверка на ничью
            boolean isDraw = true;
            for (int cell : board) {
                if (cell == EMPTY) {
                    isDraw = false;
                    break;
                }
            }
            if (isDraw) {
                displayBoard();
                System.out.println("Ничья!");
                break;
            }

            // Смена игрока
            currentPlayer = (currentPlayer == CROSS) ? NOUGHT : CROSS;
        }

        scanner.close();
    }
    public TicTacToe() {
        board = new int[9]; // Инициализация массива
    }

    // Метод для отображения текущего состояния поля
    public void displayBoard() {
        for (int i = 0; i < 9; i++) {
            char symbol;
            if (board[i] == EMPTY) {
                symbol = '.';
            } else if (board[i] == CROSS) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }
            System.out.print(symbol + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println(); // Новая строка после каждого ряда
            }
        }
    }

    // Метод для выполнения хода
    public boolean makeMove(int position, int player) {
        if (position < 0 || position >= 9 || board[position] != EMPTY) {
            return false; // Неверный ход
        }
        board[position] = player;
        return true; // Ход выполнен успешно
    }

    // Метод для проверки победителя
    public int checkWinner() {
        int[][] winningCombinations = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Горизонтали
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Вертикали
                {0, 4, 8}, {2, 4, 6}             // Диагонали
        };

        for (int[] combination : winningCombinations) {
            if (board[combination[0]] == board[combination[1]] &&
                    board[combination[1]] == board[combination[2]] &&
                    board[combination[0]] != EMPTY) {
                return board[combination[0]]; // Возвращаем победителя (1 или 2)
            }
        }
        return -1; // Нет победителя
    }


}