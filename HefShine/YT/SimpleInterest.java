//Write a program for Simple Intrest using java.
//Principle amount,rate of intrest,time
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        int principle=s.nextInt();
        System.out.print("Enter rate of Intrest : ");
        float roi=s.nextFloat();
        System.out.print("Enter the Time  : ");
        float time=s.nextFloat();

        //Si=(p*r*t)/100;
        Float Si=((principle*roi*time)/100);
        System.out.println("The Amount is Generated After Applying Simple intrest is : "+Si);


    }
}
