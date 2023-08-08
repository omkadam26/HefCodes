public class nestedFor {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        { 
            System.out.print(i+":");
            for(int j=0;j<(i+1);j++)
            {
                System.out.print(j+" ,");
            }
            System.out.println();
        }
    }
}
