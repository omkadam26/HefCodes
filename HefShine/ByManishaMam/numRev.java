import java.util.Scanner;
public class numRev {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ______ ");
        int num=s.nextInt();
        System.out.println("You have entered "+num);
        int rev=0;
        while(num!=0)
        {
            int rem=0;
            rem=num%10;
            num/=10;
            rev=rev*10+rem;
            
        }
        System.out.println("The result is  : "+rev);
        
    }
}
