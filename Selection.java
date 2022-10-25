import java.util.Arrays;

public class Selection 
{
public static void main(String[] args) 
{
  int[] arr = {3,1,4,2,5};
  sort(arr);
  System.out.println(Arrays.toString(arr));
}

static void sort(int[] array)
{
    // find the max element index and swap it with index
    for (int i = 0; i < array.length; i++) 
    {
      int last = array.length-i-1;      
      int maxIndex = getMax(array, 0, last);
      swap(array, maxIndex, last);      
    }
}

static void swap(int[] array, int swap, int swapped) 
{
  int temp = array[swap];
  array[swap] = array[swapped];
  array[swapped] = temp;
}

static int getMax(int[] array, int start, int end)
{
  int max = start;
  
  for (int i = start; i < end; i++) 
  {
    if (array[max]<array[i])
    {
      max = i;     
    }  
  }
  return max;
}

}