import java.util.Arrays;

public class MajorityElement 
{
public static void main(String[] args) 
{
 int[] arr = {3,2,3};
 withSorting(arr);
}

static int bruteForce(int[] nums)
{
    int majority = nums.length/2;
  for (int i = 0; i < nums.length; i++) 
  {
    int count = 0;
    for (int j = 0; j < nums.length; j++)
    {
        if (nums[j]==nums[i]) 
        {
          count++;    
        }
    }  
    if (count > majority) return nums[i];    
  }
  return -1;   
}  

static int withSorting(int[] nums)
{
  int m = nums.length/2;
  Arrays.sort(nums);
  return m; 
}
}