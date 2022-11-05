import java.util.Arrays;

public class ThirdMax 
{
public static void main(String[] args) 
{
    int[] nums = {3,2,1} ;
    System.out.println(maxElement(nums));  
} 
static int maxElement(int[] nums)
{
 Arrays.sort(nums);

 for (int i = 0; i < nums.length/2; i++) 
 {
    // nums[i]^=nums[end-i-1];
    // nums[end-i-1]^=nums[i];
    // nums[i]^=nums[end-i-1];
    nums[i]^=nums[nums.length - 1 - i];
    nums[nums.length - 1 - i]^=nums[i];
    nums[i]^=nums[nums.length - 1 - i];
 }
 int elemCounted = 1;
 int prevElem = nums[0];
 
 for (int index = 1; index < nums.length; ++index) {
     
     if (nums[index] != prevElem) {
         elemCounted += 1;
         prevElem = nums[index];
     }
     
     if (elemCounted == 3) {
         return nums[index];
     }
 }
 
 return nums[0];

}   
}
