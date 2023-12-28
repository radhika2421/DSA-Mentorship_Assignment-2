import java.util.Scanner;
public class pattern20
{
    public static void main(String[]args)
    {
        try(Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter no. of rows");
            int row=scn.nextInt();
            int k=row/2;
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<row;j++)
                {
                    if(j==0||j==row-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i=k;i>=0;i--)
            {
                for(int j=0;j<=k;j++)
                {
                    if(j==0||j==i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                for(int j=k-1;j>=0;j--)
                {
                    if(j==0||j==i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
