import java.util.Scanner;
public class pattern6 {
    public static void main(String[]args)
    {
        try(Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter no. of rows");
            int row=scn.nextInt();
            int col=row+2;
            int k=row/2;
            int l=col/2;
            for(int i=0;i<=k;i++)
            {
                for (int j=0;j<col;j++)
                {
                    if(j>=l-i&&j<=l+i)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (int i=k-1;i>=0;i--)
            {
                for (int j=0;j<col;j++)
                {
                    if(j>=l-i&&j<=l+i)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}