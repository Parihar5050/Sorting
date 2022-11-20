import java.util.Arrays;

public class CanAP 
{
public static void main(String[] args) 
{
 int[] nums = {1,2,4}; 
 System.out.println(canMakeArithmeticProgression(nums));
}
static boolean canMakeArithmeticProgression(int[] arr)
{
 Arrays.sort(arr);

 for (int i = 1; i < arr.length; i++) 
 {
  if (arr[i] != (arr[i - 1] + arr[1] - arr[0])) 
  {
    return false;
  }
 }
 return true;
}    
}
