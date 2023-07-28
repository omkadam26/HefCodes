import java.util.Scanner;
class CNProblem2 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int Step=s.nextInt();
		for(int i=S;i<=E;i=i+Step)
		{
			System.out.println(i);
		}
		
	}
}