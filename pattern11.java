import java.util.Scanner;
public class pattern11
{
    public static void main(String[]args)
    {
        try(Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter no. of rows");
            int row=scn.nextInt();
            int k=1;
            for (int i=1;i<=row;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}
