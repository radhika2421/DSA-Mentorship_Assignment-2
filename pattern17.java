import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int row = 13;
            int k = row / 2;
            for (int i = 0; i <= k; i++) {
                for (int j = 0; j < k; j++) {
                    if (i == k) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = k - 1; i >= 0; i--) {
                for (int j = 0; j < k; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
