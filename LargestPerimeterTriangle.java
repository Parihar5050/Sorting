import java.util.Arrays;

/*Har Har Mahadev*/
public class LargestPerimeterTriangle 
{
public static void main(String[] args) 
{
 int[] array = {2,1,2};
 System.out.println(checkTriangle(array));
    
}
static int checkTriangle(int[] nums) 
{
    Arrays.sort(nums);
    /* for max sum max number would exist at last*/
    for (int i = nums.length-3; i >= 0; --i)
    {
        if (nums[i]+nums[i+1] > nums[i+2]) 
        {
          return nums[i]+nums[i+1]+nums[i+2];
        }
    }
 return 0;    
}    
}