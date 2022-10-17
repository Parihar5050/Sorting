import java.util.Arrays;

/*Har Har mahadev*/
public class Bubble
{
public static void main(String[] args)
{
  // int[] arr = {3,1,5,4,2};
  int[] arr = {1,2,3,4,5};
  bSorting(arr);
  System.out.println(Arrays.toString(arr));
}
static void bSorting(int[] array)
{
  boolean swapped;
  for (int i = 0; i < array.length; i++) 
  { /*loop running n-1*/
    swapped = false;

    for (int j = 1; j < array.length-i; j++) 
    { /*swapping of number item is smaller than previous*/
        if (array[j]<array[j-1])
        {
          int temp = array[j];
          array[j] = array[j-1];
          array[j-1] = temp;
          swapped = true;              
        }   
    }    
    if(!swapped) 
      break; 
  }
  
}

}