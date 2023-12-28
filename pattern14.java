import java.util.Scanner;
public class pattern14
{
    public static void main(String[] args)
    {
        try(Scanner scn = new Scanner(System.in))
        {
            System.out.println("Enter the required number for multiplication table");
            int n = scn.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+" * "+i+" = "+n*i);
            }
        }
    }
}