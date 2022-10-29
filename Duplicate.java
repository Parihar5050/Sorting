public class Duplicate 
{
public static void main(String[] args) 
{
    
}

static int sort(int[] array)
{
  int i = 0;
  while (i<array.length)
  {
    if (array[i]!=i+1) 
    {
        int correct = array[i]-1;

        if (array[i] != array[correct])
        {
          swapp(array, i, correct);    
        } 
        else
        {
            return array[i];
        }
    } 
    else 
    {
      i++;    
    }      
  }
  return -1;
}

static void swapp(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}
}
