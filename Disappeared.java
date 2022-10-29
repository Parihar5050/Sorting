import java.util.ArrayList;
import java.util.List;

public class Disappeared 
{
public static void main(String[] args) 
{
    
}

static List<Integer> sort(int[] array)
{
  int i = 0;
  while (i<array.length)
  {
    int correct = array[i]-1;
    
    if(array[i]!=array[correct])
    {
      swap(array, i, correct);
    } 
    else{i++;}
  }
  
  List<Integer> ans = new ArrayList<>();
  for (int index = 0; index < array.length; index++) 
  {
    if (array[index]!=index+1) 
    {
      ans.add(index+1);
    }  
  }
  return ans;
}

static void swap(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}
}
