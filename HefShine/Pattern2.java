public class Pattern2 {
    public static void main(String[] args) {
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4 
         * 1 2 3 4 5 
         * 1 2 3 4 5 6 
         */
        int n=6;
        int row=1;
        while(row<=n)
        {
            int cols=1;
            while(cols<=row)
            {
                System.out.print(cols+" ");
                cols++;
            }
            System.out.println();
            row++;
        }
    }
}
