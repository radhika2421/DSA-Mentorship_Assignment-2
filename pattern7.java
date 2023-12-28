import java.util.Scanner;
public class pattern7
{
    public static void main(String[]args)
    {
        try(Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter no. of rows");
            int row=scn.nextInt();
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<row;j++)
                {
                    if(j==i)
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
