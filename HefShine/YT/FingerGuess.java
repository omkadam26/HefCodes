public class FingerGuess {
    public static void main(String[] args) {
        int num=10;
        int finger=0;
        int incOrDecr=0;   //0- increment 1-decrement.
        for(int i=1;i<=num;i++)
        {
            if(incOrDecr==0)
                finger++;
            else
               finger--;

            if(finger==5)
               incOrDecr=1;
              
            if(finger==1)
                incOrDecr=0;

            System.out.println(i+ " "+finger);
            System.out.println();
        }
        switch (finger) {
            case 1:
                System.out.println("Thumb Finger");
                break;
            case 2:
               System.out.println("Index Finger");
               break;
            case 3:
               System.out.println("Middle Finger");
               break;
            case 4:
               System.out.println("Ring Finger.");
               break;
            case 5:
               System.out.println("Little Finger.");
               break;
            default:
                System.out.println("Invalid .");
        }

    }
}
