import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter no. of rows");
            int row = scn.nextInt();
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row; j++) {
                    if (j >= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
