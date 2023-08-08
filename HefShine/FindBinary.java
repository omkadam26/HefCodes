import java.util.Scanner;
public class FindBinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       String Result=FindBinary(n);
       System.out.println("Binary of "+n+" is" +Result);


    }
     public static String FindBinary(int n)
        {
            String bin = Integer.toBinaryString(n);
            return bin;
        }
}



