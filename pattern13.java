import java.util.Scanner;
public class pattern13
{
    public static void main(String[] args)
    {
        try(Scanner scn = new Scanner(System.in))
        {
            System.out.println("Enter number of rows");
            int row = scn.nextInt();
            for (int i = 0; i < row; i++ )
                {
                    int k = 1;
                    for (int j = 0; j <= i; j++)
                    {
                        int p=i-j;
                        int d=j+1;
                        System.out.print( k +" ");
                        int l = (k * p) / d;
                        k = l;
                    }
                    System.out.println();
                }
        }
    }
}