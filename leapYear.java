import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the Year =");
        n=r.nextInt();

        if(n%100==0 && n%400==0 || n%100!=0 && n%4==0)
        {
          System.out.println("Leap Year....");
        }
        else
        {
            System.out.println("Not Leap Year....");
        }
        r.close();
    }
    
}
