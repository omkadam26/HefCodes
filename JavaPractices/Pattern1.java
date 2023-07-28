public class Pattern1 {
    public static void main(String[] args) {
        /*
         *  * * * * 
         *  * * * * 
         *  * * * * 
         *  * * * * 
         */
        int n=10;
        int row=1;
        while(row<=n)
        {
            int column=1;
            while(column<=n)
            {
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }

        }
}
