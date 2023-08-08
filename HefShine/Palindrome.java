import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("___________Palindrome Program____________ ");
        System.out.println("Input : ");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuffer sb=new StringBuffer(str);
        if((sb.reverse().toString())==str)
        {
            System.out.println("Palindrome.")
        }
        else
        {
            System.out.println("!");
        }
        

    }
}
