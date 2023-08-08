public class SumOfFactors {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int SumOfFactors1=0;
        int SumOfFactors2=0;
        for(int i=1;i<=num1;i++)
        {
            int rem=num1 % i;
            if(rem==0)
            {
                SumOfFactors1=SumOfFactors1+i;

            }
        }
        System.out.println("SumofFactor1 = "+SumOfFactors1);
         for(int i=1;i<=num2;i++)
        {
            int rem=num2%i;
            if(rem==0)
            {
                SumOfFactors2=SumOfFactors2+i;
                
            }
        }
        System.out.println("SumofFactor2 = "+SumOfFactors2);
        if(SumOfFactors1==num2&& SumOfFactors2==num1)
        sout("amicable number");
        else
        sout("false");
        
    }

}
