
import java.util.Scanner;

public class holloSquare {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square  = ");
        n=sc.nextInt();

        for(i=0; i<=n; i++)
        {
            for(j=0;j<=n;j++)
            {
                if((i==0 || i==n) || (j==0 || j==n))
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
