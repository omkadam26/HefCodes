import java.util.Scanner;

public class Pattern8
{
    /*
     * 1
     * 2 3
     * 3 4 5 
     * 4 5 6 7
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
         while(i<=n)
         {
             int j=1;
             while(j<=i*i)
             {
                System.out.print(i);
                j+=1;
             }
             System.out.println();
             i+=1;
         }
    }
}