import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);

        System.out.println("enter your acount number");
        int ac = sc.nextInt();
        if (ac == 123) {
            int p = 5000;
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            int n = sc.nextInt();

            switch (n) {
                case 1: {
                    System.out.println("Enter the amount to be deposoited =");
                    int a = sc.nextInt();
                    System.out.println("Total balance in your account = " + (a + p));
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount to be withdraw = ");
                    int a = sc.nextInt();
                    System.out.println("Total balance left in account = " + (a - p));
                    break;
                }
                case 3: {
                    System.out.println(" Total balance in your account = " + (p));
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
        sc.close();
    }    
}
