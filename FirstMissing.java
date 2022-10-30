public class FirstMissing 
{
public static void main(String[] args) 
{
    
}
static int sort(int[] array)
{
   int i = 0; 
   while(i<array.length)
   {
    int correct = array[i]-1;

    if (array[i] > 0 &&  array[i] < array.length && array[i] != array[correct])
    {
      swapp(array, i, correct);    
    }
    else{ i++; }
   }
   for (int index = 0; index < array.length; index++) 
   {
    if (array[index]!=index+1) 
    {
       return index+1;
    } 
   }
   return array.length+1;
}
static void swapp(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}
}
