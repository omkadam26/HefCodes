import java.util.Arrays;
import java.util.Scanner;

class ArrayDupCount
{
  public static void main(String args[])
  {
    int[]  arr={1,5,9,7,2,3,1,0,8,9};
    System.out.println("Array elements are : ");
    for(int i=0;i<arr.length;i++)
    {
     System.out.print(" "+arr[i]);
    }
    System.out.println("/n");
    System.out.println("and after sorting the array looks like : ");
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    {      
      System.out.print(" "+arr[i]);
    }
    System.out.println("  and the logic to find repetitive elements.");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=1;j<arr.length;j++)
      {
        if(arr[i]==arr[j])
        {
          System.out.println("here is the occurances "+arr[i]);
        }
        else{
          return;
        }
      }
    }
  }
}