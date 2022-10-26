import java.util.Arrays;
import java.util.Scanner;

/*array = {3,0,1} output = 2*/
public class MissingNumber 
{
public static void main(String[] args) 
{
    int[] nums = {3,0,1};
    cyclic(nums);
    
}

static int cyclic(int[] array)
{
  int i = 0;
  while (i<array.length)
  {
    int correct = array[i];
    
    if(array[i] < array.length && array[i]!=array[correct])
    {
      swap(array, i, correct);
    } 
    else{i++;}
  }  

  for (int j = 0; j < array.length; j++) 
  {
   if (array[i]!= i)
   {
    return i; 
   }  
  }
  return array.length;

    
} 
static void swap(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}   
}