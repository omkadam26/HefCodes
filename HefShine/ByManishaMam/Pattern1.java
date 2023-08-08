import java.util.Scanner;
/*
 n=5;
 1
 1 0
 1 0 1 
 1 0 1 0
 1 0 1 0 1

 */
public class Pattern1 {
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
    }
}
