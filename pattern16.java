import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int row = 5;
            int col = 2 * row - 1;
            int k = col / 2;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <= i; j++) {
                    int n = j + 1;
                    System.out.print(n + " ");
                }
                for (int j = i + 1; j <= k; j++) {
                    System.out.print(" ");
                }
                if (i == row - 1) {
                    for (int j = k - 1; j >= 0; j--) {
                        int m = j + 1;
                        System.out.print(m + " ");
                    }
                } else {
                    for (int j = k - 1; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = i; j >= 0; j--) {
                        int m = j + 1;
                        System.out.print(m + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
