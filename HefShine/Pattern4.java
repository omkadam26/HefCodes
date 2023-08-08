public class Pattern4 {
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
            while(column<=row)
            {
                System.out.print(column+" ");
                column++;
            }
            System.out.println();
            row++;
            
        }
        
        while(row<=n)
        {
            int column=n;
            while(column>=0)
            {
                System.out.print(column+" ");
                column--;
            }
            System.out.println();
            row++;

        }
    }
}