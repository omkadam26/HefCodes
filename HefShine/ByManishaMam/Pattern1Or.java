import java.util.Scanner;
public class Pattern1Or {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=s.nextInt();
        System.out.println("=========================");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               if(j%2==0)
                    System.out.print("0"+" ");
                else
                    System.out.print("1"+" ");
            }
            System.out.println();
}

}
}