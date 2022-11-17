import java.util.Arrays;

public class NumberOfElementSmaller 
{
public static void main(String[] args) 
{
  int[] arr = {8,1,2,2,3};
  System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
}
static int[] smallerNumbersThanCurrent(int[] nums)
{
  int[] ans = new int[nums.length];
 for (int i = 0; i < nums.length; i++) 
 {
  int count = 0;
 for (int j = nums.length-1;j>0; j--) 
 {
  if (i!=j && nums[i] > nums[j])
  {
    count++;
  }  
  ans[i] = count;    
 }  
 }     
  return ans;
}    
}
