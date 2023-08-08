package Patterns;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ___ ");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

Output Screen.
        Enter Number ___ 5
        0 
        0 1 
        0 1 2 
        0 1 2 3 
        0 1 2 3 4 
*/