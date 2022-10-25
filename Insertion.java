import java.util.Arrays;

public class Insertion 
{
public static void main(String[] args) 
{
  int[] arr ={-23,56};
  sort(arr);
  System.out.println(Arrays.toString(arr)); 
} 

static void sort(int[] array)
{
  for (int i = 0; i < array.length-1; i++) 
  {
    for (int j = i+1; j > 0; j--) 
    {
      if (array[j] < array[j-1])
      {
        swapp(array, j, j-1);  
      }  
      else {break;}  
    }  
  }  
}

static void swapp(int[] array, int j, int i) 
{
  int temp = array[j];
  array[j] = array[i];
  array[i] = temp;
}
}
