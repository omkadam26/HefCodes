package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ___ ");
        int n=s.nextInt();
        
        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
    