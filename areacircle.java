import java.util.Scanner;

public class areacircle {
    public static void main(String[] args) {
        int r;
        final double pie=3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius =");
        r= sc.nextInt();
        

        area = pie*r*r;
        System.out.println("Area = "+area);
        sc.close();

    }
}
