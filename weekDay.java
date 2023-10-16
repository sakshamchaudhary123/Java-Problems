import java.util.Scanner;

public class weekDay {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("Choose any number.\n 1 (Monday)\n 2 (Tuesday)\n 3 (wednesday)\n 4 (Thursday)\n 5 (Friday)\n 6 (Saturday)\n 7 (Sunday)");
        n=r.nextInt();

        if(n==1)
        {
         System.out.println("Monday");
        }
        else if(n==2)
        {
            System.out.println("Tuesday");
        }
        else if(n==3)
        {
            System.out.println("Wednesday");
        }
        else if(n==4)
        {
            System.out.println("Thursday");
        }
        else if(n==5)
        {
            System.out.println("Friday");
        }
        else if(n==6)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Sunday");
        }
        r.close();
    }
}
