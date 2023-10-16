import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        int m, n;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the range =");
        n=r.nextInt();
        m=r.nextInt();

        for(int i=n; i<=m; i++)
        {
           if(i%2==0)
           {
            System.out.println("Even ="+i);
           }
           else
           {
            System.out.println("odd");
           }
        }
         r.close();

    }
    
}
