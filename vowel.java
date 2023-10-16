import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        char ch;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter any character =");
        ch=r.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("vowel....");
        }
        else
        {
            System.out.println("Consonant....");
        }
        r.close();
    }
}
