
import java.util.Arrays;
public class Main
{
 public static void main (String[]args)
  {
    int[] arr = { 25, 14, 56, 15, 36, 36, 77, 18, 18, 49 };
    int size=arr.length;
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        if(arr[i]==arr[j])
        {
          arr[j]=arr[size-1];
          size--;
        }
     }
    }

   for(int a=0;a<size;a++)
    {
      System.out.print(arr[a]+" ");
    }

  }

}
