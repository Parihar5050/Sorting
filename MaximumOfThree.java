import java.util.Arrays;

public class MaximumOfThree 
{
public static void main(String[] args) 
{
  int[] nums = {1,2,3};
  int v = maximumOfProduct(nums);
  System.out.println(v);
  System.out.println(Arrays.toString(nums));  
}
static int maximumOfProduct(int[] nums) 
{
    /*sort and reverse the array to access element faster store them in ans var run loop for 3 as its 
    * required max of three
    it will work for +ve int
    */
 Arrays.sort(nums);

//  if (nums.length <= 2) 
//  {
//   return nums[0]*nums[1];
//  }
//  else
//  {
//     return nums[0]*nums[1]*nums[nums.length-1];
//  } 

 return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);    

 
 
    
}    
}