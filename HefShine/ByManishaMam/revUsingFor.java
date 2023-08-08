import java.util.Scanner;
public class revUsingFor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ______ ");
        int num=s.nextInt();
        System.out.println("You have entered "+num);
        int rev=0;
        int rem=0;
        for(rev=0;num!=0;rev++)
        {
            
            rem=num%10;
            num/=10;
            rev=rev*10+rem-1;
            
        }
        System.out.println("The result is  : "+rev);
        
    }
}

