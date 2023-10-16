import java.util.Scanner;

public class countno {
    public static void main(String[] args) {
        int n,count=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any digit =");
        n=r.nextInt();

        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Numbers are = "+count);
        r.close();
    }
}
