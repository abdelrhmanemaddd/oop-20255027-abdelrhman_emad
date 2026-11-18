
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[][] board = new char[3][3];
        System.out.println("Enter 9 cells (X or O): ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = in.next().charAt(0);
            }
        }
        int xCount = 0;
        int oCount = 0;
        boolean fullXRow = false;

        for (int i = 0; i < 3; i++) {
            int rowX = 0;
            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
                if (board[i][j] == 'X') {
                    xCount++;
                    rowX++;
                }
                else if (board[i][j] == 'O') {
                    oCount++;
                }
            }
            System.out.println();

            if (rowX == 3) {
                fullXRow = true;
            }
        }
        System.out.println("X count: " + xCount);
        System.out.println("O count: " + oCount);

        if (fullXRow) {
            System.out.println("X has a full row");
        }
        else {
            System.out.println("No full X row");
        }
    }
}
