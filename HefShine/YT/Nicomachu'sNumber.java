public class Nicomachu'sNumber {
    public static void main(String[] args) {
        int num=9;
        int cubeNSum=0;
        int sumNSqr=0;
        for(int i=1;i<=num;i++)
        {
            int cube=i*i*i;
            cubeNSum +=cube;
        }
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum +=i;
            
        }
        sumNSqr=sum*sume22;

       if(sumNSqr==cubeNSum)
         System.out.println("Nicomachu's Number");
       else
       System.out.println("Not");
        
    }
}
