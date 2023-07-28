import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input __________ ");
        int num=12345;
        int digit=0;
        int sum=0;

        for(sum=0;sum<=num;sum++)
        {
            digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        System.out.println(sum);
    }
}
