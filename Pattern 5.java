import java.util.Scanner;
public class pattern5 
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("enter no. of rows (must be odd)");
            int row=scn.nextInt();
            int k=row/2;
            for (int i=0;i<=k;i++)
            {
                for(int j=0;j<k-i;j++)
                {
                    System.out.print(" ");
                }
                for (int j=k-i;j<=k+i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=k-1;i>=0;i--)
            {
                for(int j=0;j<k-i;j++)
                {
                    System.out.print(" ");
                }
                for (int j=k-i;j<=k+i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
