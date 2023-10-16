import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        int x,y;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter value for x =");
        x=r.nextInt();
        System.out.println("Enter value for y =");
        y=r.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("The swaped no are : x="+x+"\ny="+y);
        r.close();

    }
}