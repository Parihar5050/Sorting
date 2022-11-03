public class DuplicateBool 
{
public static void main(String[] args) 
{
    
}    

static boolean sort(int[] nums)
{
   int i = 0; 
   while(i<nums.length)
   {
    int correct = nums[i]-1;

    if (nums[i] < nums.length && nums[i] != nums[correct])
    {
      swapp(nums, i, correct);    
    }
    else{ i++; }
   }

   for (int j = 0; j < nums.length; j++) 
   {
    if (nums[j]!=j+1) 
    {
      return true;   
    } 
   }
   return false;
}
private static void swapp(int[] array, int i, int correct) 
{   
    int temp = array[i];
    array[i] = array[correct];
    array[correct] = temp;
}

}
