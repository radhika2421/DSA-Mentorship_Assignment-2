import java.util.Scanner;
public class pattern8
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter no. of rows");
            int row=scn.nextInt();
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<row;j++)
                {
                    if(i+j==row-1)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
