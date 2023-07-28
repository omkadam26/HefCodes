import java.util.Arrays;

public class CountNonRepeatitiveElement {
    
   public static void main(String[] args) {
     int[] arr={1,2,3,3,4,4,8,9,10,3};
    //Loop To check the NonRepeated Elements in array.
    for(int i=0;i<arr.length;i++)
    {
         int x=arr[i];
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==x)
            {
                count++;
            }
        }
        if(count==1)
        {
           // System.out.println("The non-repeatative element is "+arr[i]);
        }
    }
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    {
      //  System.out.print(" "+arr[i]);
    }
    //loop to find the Repeatitive Elements from the Array.
    for(int i=0;i<arr.length;i++)
    {
        int x=arr[i];
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==x)
            {
               count++;
            }
        }
        if(count==1)
        {
            System.out.println("The non- repeatative element is "+arr[i]);
        }
    }


   }


}
