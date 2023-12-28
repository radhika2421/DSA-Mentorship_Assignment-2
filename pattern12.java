import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter number of rows");
            int row=scn.nextInt();
            int p = 1;
            int l=0;
            int k;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == 0) {
                        System.out.print("0");
                    }
                    else
                    {
                        System.out.print(p + " ");
                        k=p;
                        p=p+l;
                        l=k;
                    }

                }
                System.out.println();
            }
        }
    }
}
