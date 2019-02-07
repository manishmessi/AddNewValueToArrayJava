import java.util.Arrays;
public class Main
{
  public static void main (String[]args)
  {


    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
    int[] my_array2 = new int[my_array.length+1];
    int removeIndex = 1;
    int j = 0;
    int k = 0;
    for (int i = 0; i <= my_array.length; i++)
      {
	if (i == 1)
	  {
	    my_array2[j] = 4;
	    k = 1;
	    j++;
	  }

	else
	  {
	   
		my_array2[j] = my_array[i - k];
		j++;
	       }
      }
    System.out.println ("Original Array : " + Arrays.toString (my_array2));
  }
}
