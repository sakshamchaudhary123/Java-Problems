import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int ch;
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two values =");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Enter Your Choice....\n 1. Addition(1)\n 2.Subtraction(2)\n 3.Divide(3)\n 4.Multiply(4)\n 5.Modulus(5)");
        ch=sc.nextInt();
        switch(ch){
            case 1: System.out.println("Addition ="+(a+b));
            break;
             case 2: System.out.println("Subtraction ="+(a-b));
            break;
             case 3: System.out.println("Divide ="+(a/b));
            break;
             case 4: System.out.println("Multiplication ="+(a*b));
            break;
             case 5: System.out.println("Modulus ="+(a%b));
            break;
            default: System.out.println("Invalid Input");
            
        }
        sc.close();
    }
}

    

