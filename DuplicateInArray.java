import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray 
{
public static void main(String[] args) 
{
    
}
static List<Integer> findDuplicates(int[] array)
{
    int i = 0; 
    while(i<array.length)
    {
     int correct = array[i]-1;
 
     if (array[i] != array[correct])
     {
       swapp(array, i, correct);    
     }
     else{ i++; }
    }

    List<Integer> ans = new ArrayList<>();
    for (int j = 0; j < array.length; j++) 
    {
        if(array[j]!= j+1)  
        {         
        ans.add(array[j]);   
        }
    } 
    return ans;

} 
static void swapp(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}

}
