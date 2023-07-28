
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input ______ ");
        int num=s.nextInt();
        int SumOfFactor=0;
        for(int i=1;i<num;i++)
        {
            int rem=num%i;
            if(rem==0)
              SumOfFactor += i;
        }
        if(SumOfFactor==num)
           System.out.println(num+" Is a Perfect Number");
        else
           System.out.println(num+ " is Not Perfect Number .");
    }
}
