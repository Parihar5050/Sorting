import java.util.Arrays;

public class SortedSq 
{
public static void main(String[] args) 
{
    int[] array = {-4,-1,0,3,10};
    sqConverter(array);
    System.out.println(Arrays.toString(array));
}
static int[] sqConverter(int[] nums) 
{
    for (int i = 0; i < nums.length; i++) 
    {
        nums[i]*=nums[i];   
    }
    Arrays.sort(nums);
    return nums;    
}    
}
