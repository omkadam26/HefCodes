import java.util.Scanner;
public class Pattern5
{
    /*
     * 4 3 2 1
     * 4 3 2 1
     * 4 3 2 1
     * 4 3 2 1
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=n;
            while(j>0)
            {
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}