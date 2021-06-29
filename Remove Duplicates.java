
import java.util.Arrays;
public class Main
{
 public static void main (String[]args)
  {
    System.out.println("--------------DuplicatesArray------------------");
        int[] arr = {2, 99, 99, 99, 2, 99, 10, 2, 99, 2, 99, 99, 99, 2, 99, 99, 99, 1, 3, 5, 3, 2, 2, 2, 2, 99, 99, 99,
                2, 99, 99, 99, 2, 99, 10, 2, 99, 2, 2, 99, 99, 99, 2, 99, 10, 2, 99, 2, 8, 8, 8, 8};
        int size = arr.length;
        int[] newArr = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        arr[i] = 0;
                    }
                }
            }
        }

        for (int j : arr) {
            if (j != 0) {
                newArr[k] = j;
                k++;
            }
        }

        System.out.println("------------After replacing duplicates value with zero---------------");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------After removing duplicates-------------");

        for (int a = 0; a < k; a++) {
            System.out.print(newArr[a] + " ");
        }
  }

}
