import java.util.Scanner;

public class taxCal {
    public static void main(String[] args) {
        int Tax=0,n;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the income =");
        n=r.nextInt();

        if(n<10000)
        {
            Tax=0;
        }
        else if(n>=10000 && n<20000)
        {
            Tax=(int)(n*(0.1));
        }
        else if(n>=20000 && n<30000)
        {
            Tax=(int)(n*(0.15));
        }
        else
        {
            Tax=(int)(n*(0.25));
        }
        System.out.println("Your Tax is ="+Tax);
        r.close();
    }
}
