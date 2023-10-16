import java.util.Scanner;

public class discountCal {
    public static void main(String[] args) {
        int Dis=0,n;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the total Amount of Bill =");
        n=r.nextInt();

        if(n<=1000 && n<=5000)
        {
            Dis=(int)(n*(0.5));
        }
        else if(n>=5000 && n<10000)
        {
            Dis=(int)(n*(0.10));
        }
        else if(n>=10000 && n<20000)
        {
            Dis=(int)(n*(0.15));
        }
        else
        {
            Dis=(int)(n*(0.25));
        }
        System.out.println("Your Discount is ="+Dis);
        n=n-Dis;
        System.out.println("Your Total Bill is ="+n);
        r.close();
        
    }
}
