/*
 * i/p ----->
 */

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n=0,m=1,s=0,num1;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter any number =");
        num1 = r.nextInt();
        for(int i=0;i<=n;i++)
        {
            s=n+m;
            n=m;
            m=s;
        }
        System.out.println("Series ="+num1);
        r.close();

    }
}
