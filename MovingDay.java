import java.util.Scanner;

public class MovingDay {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("---- MovingDay Game ----");

        System.out.println("Number of False: ");
        int n = kb.nextInt();
        System.out.println("Number of True: ");
        int m = kb.nextInt();

        int[] board = new int[n + m + 1];

        for (int i = 0; i < m; i++) {
            board[i] = 1;
        }
        board[m] = 0;
        for (int i = m + 1; i < board.length; i++) {
            board[i] = 2;
        }

        while (true) {
            displayBoard(board);
            if (checkWin(board, n, m)) {
                System.out.println("Congratulations!");
                break;
            }

            System.out.println("Choose Move: ");
            int move = kb.nextInt();

            if (move < 0 || move >= board.length) {
                System.out.println("Invalid");
                continue;
            }

            if (board[move] == 1) {
                if (move + 1 < board.length && board[move + 1] == ' ') {
                    System.out.println("Jumping True: " + move + " to the RIGHT");
                    board[move + 1] = 1;
                    board[move] = ' ';
                } else if (move + 2 < board.length && board[move + 1] != 0 && board[move + 2] == 0) {
                    System.out.println("Jumping True @" + move + " to the RIGHT");
                    board[move + 2] = 1;
                    board[move] = 0;
                } else {
                    System.out.println("Cannot move from position " + move);
                }

            } else if (board[move] == 2) {
                if (move - 1 >= 0 && board[move - 1] == 0) {
                    System.out.println("Jumping False @" + move + " to the LEFT");
                    board[move - 1] = 2;
                    board[move] = 0;

                } else if (move - 2 >= 0 && board[move - 1] != 0 && board[move - 2] == 0) {
                    System.out.println("Jumping False @" + move + " to the LEFT");
                    board[move - 2] = 2;
                    board[move] = 0;

                } else {
                    System.out.println("Cannot move from position " + move);
                }
            } else {
                System.out.println("Pick One!");
            }

            if (checkNoMore(board, n, m)) {
                System.out.println("Game over! You lose!");
                break;
            }
        }
    }

    private static void displayBoard(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 0);
        }
        System.out.println();
        for (int c : board) {
            System.out.print("| " + c + " ");
        }
        System.out.println("|");
    }

    private static boolean checkWin(int[] board, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (board[i] != 2) {
                return false;
            }
        }
        return board[n] == 0;
    }

    public static boolean checkNoMore(int[] board, int n, int m) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 1 && ((i + 1 < board.length && board[i + 1] == 0) ||
                (i + 2 < board.length && board[i + 1] != 0 && board[i + 2] == 0))) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == 2 && ((i - 1 >= 0 && board[i - 1] == 0) ||
                (i - 2 >= 0 && board[i - 1] != 0 && board[i - 2] == 0))) {
                return false;
            }
        }
        return true;
    }
}
