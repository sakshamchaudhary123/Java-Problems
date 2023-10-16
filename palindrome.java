import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,s=0,c,m;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter any number =");
        n=r.nextInt();

        c=n;
        while(n>0)
        {
         m=n%10;
         s=(s*10)+m;
         n=n/10;
        }
        if(c==s)
        {
            System.out.println("Palindrome no....");

        }
        else{
            System.out.println("Not palindrome....");
        }
        r.close();
    }
}
