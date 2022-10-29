public class SetMatch
{
public static void main(String[] args) 
{
    
}
public int[] findErrorNums(int[] array) 
{
  int i = 0;
  while (i<array.length)
  {
    int correct = array[i];
    
    // array[i] < array.length is for boundary case 

    if(array[i]!=array[correct])
    {
      swap(array, i, correct);
    } 
    else{i++;}
  }  

  for (int index = 0; index < array.length; index++) 
  {
   if (array[index]!= index+1)
   {
    return new int[] {array[index], index+1} ; 
   }  
  }    
 return new int[] {-1,-1} ;
}

static void swap(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}   


}
