import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=s.nextInt();
        System.out.println("=========================");
        for(int i=1;i<=n;i++)
        {
            int value=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(value+" ");
                value=(value==0)?1:0;
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--)
        {
            int value=1;
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(value+" ");
                value=(value==0)?1:0;
            }
            System.out.println();
        }
    }
}
