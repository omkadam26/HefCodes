import java.util.Scanner;

public class CountNumberOfCharacter
{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str=s.nextLine();

        int Count=str.length();
        System.out.println("The number of Character in Entered String is :"+Count);
        


    }
}