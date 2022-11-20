import java.util.Arrays;

/*🕉️*/
/*Sort the array and max element will be on last return the product */
public class MaximumProductOfTwoElement 
{
public static void main(String[] args) 
{
 int[] nums = {1,5,4,5};
// int[] nums = {3};
 System.out.println(arrayProduct(nums));
}
static int arrayProduct(int[] nums)
{
 Arrays.sort(nums);
 return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
}    
}