public class Count1FromBinary {
    public static void main(String[] args) {
        int n=4;
        String bin = Integer.toBinaryString(n);
        int count1=0;
        int count0=0;
        System.out.println("the Binary of Number "+n+" is "+bin);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)!=1)
            {
                count0+=1;
            }
            else
            {
                count1+=1;
            }
        }
        System.out.println("The number of 1's in String "+count1);
        System.out.println("The number of 0's in String "+count0);
    }
}
