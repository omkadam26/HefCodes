import java.util.Scanner;

public class Pattern6
{
    /*
     * 1
     * 2 3
     * 4 5 6 
     * 7 8 9 10
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int p=i;
        while(i<=n)
        {   
            int j=1;
            while(j<=i)
            {
                System.out.print(p+" ");
                p++;
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
}