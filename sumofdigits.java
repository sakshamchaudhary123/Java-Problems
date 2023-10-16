import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        int n,res,sum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any digit =");
        n=r.nextInt();

        while(n>0)
        {
            res=n%10;
            sum=sum+res;
            n=n/10;
        }
        System.out.println("sum ="+sum);
        r.close();
    }
    
}
