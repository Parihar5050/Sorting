import java.util.Arrays;

public class SortByParity 
{
public static void main(String[] args) 
{
 int[] nums = {3,1,2,4};
//  parity(nums);
 System.out.println(Arrays.toString(parity(nums)));
}

static int[] parity(int[] nums) 
{
  for (int i = 0; i < nums.length-1; i++) 
  {
    for (int j = i+1; j > 0; j--) 
    {
     if (nums[j]%2 == 0)
     {
       swapp(nums, j, j-1);  
     }  
     else {break;}  
    }  
  }
  return nums;
}  
static void swapp(int[] array, int j, int i) 
{
  int temp = array[j];
  array[j] = array[i];
  array[i] = temp;
}

static int[] optimized(int[] nums) 
{
 int j = 0;
 for(int i = 0; i< nums.length; i++)
 {
  if(nums[i]%2 ==0)
  {
   swapp(nums, j, i);
   j++;
  }     
 }
 return nums;
}  
}
