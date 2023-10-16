
import java.util.Scanner;

public class halfrightPyramid {
    public static void main(String[] args) {
    int n,i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size = ");
    n=sc.nextInt();

    for(i=0 ; i<=n ; i++)
    {
        for(j=n ; j>=i ; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
