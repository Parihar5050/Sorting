import java.util.Arrays;

public class ArrayPartition 
{
    public static void main(String[] args) 
    {
            
    }
    static int sortingWay(int[] nums) 
    {
        Arrays.sort(nums);
        // Initialize sum to zero
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // Add every element at even positions (0-indexed)
            maxSum += nums[i];
        }
        return maxSum;    
    }
}
