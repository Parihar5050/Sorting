import java.util.Arrays;

/*When range is given from 1 to N use cyclic sort*/
public class Cyclic 
{
public static void main(String[] args) 
{
    int[] arr =  {1,4,3,2};
    sort(arr);
    System.out.println(Arrays.toString(arr));
}    
static void sort(int[] array)
{
   int i = 0; 
   while(i<array.length)
   {
    int correct = array[i]-1;

    if (array[i] < array.length && array[i] != array[correct])
    {
      swapp(array, i, correct);    
    }
    else{ i++; }
   }
}
private static void swapp(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}
}
