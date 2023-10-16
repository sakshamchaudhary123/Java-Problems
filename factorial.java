import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any number =");
        n=r.nextInt();

        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial ="+fact);
        r.close();
    }
}
