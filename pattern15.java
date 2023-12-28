import java.util.Scanner;
public class pattern15
{
    public static void main(String[] args)
    {
        try(Scanner scn = new Scanner(System.in))
        {
            System.out.println("Enter number of rows");
            int row = scn.nextInt();
            int l=row/2;
            for(int i=0;i<=l;i++)
            {
                int k=i+1;
                int m=2*i;
                for(int j=0;j<l-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=l-i;j<=l;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                for(int j=l+1;j<=l+i;j++)
                {
                    System.out.print(m+" ");
                    m--;
                }
                int j=(l-i)+1;
                while(j>l+i&&j<row)
                {
                    System.out.print(" ");
                    j++;
                }
            System.out.println();
            }
            for(int i=l-1;i>=0;i--)
            {
                int k=i+1;
                int m=2*i;
                for(int j=0;j<l-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=l-i;j<=l;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                for(int j=l+1;j<=l+i;j++)
                {
                    System.out.print(m+" ");
                    m--;
                }
                int j=(l-i)+1;
                while(j>l+i&&j<row)
                {
                    System.out.print(" ");
                    j++;
                }
            System.out.println();
            }
        }
    }
}