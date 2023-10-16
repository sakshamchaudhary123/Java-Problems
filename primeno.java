import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter any Number = ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n; i++)
        {
            if(n%1==0)
            {
            count++;
            }
        }    
        if(count==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
        r.close();
    }
    
}
