import java.util.Arrays;

/*Har Har Mahadev*/
public class ArrayParity2 
{
public static void main(String[] args) 
{
    int[] array = {4,2,7,6,5,9};
    // int[] array = {2,3};
    parityTwo(array);
    System.out.println(Arrays.toString(array));
}
static int[] parityTwo(int[] nums) 
{
    int i  = 0;
    int j = 1;

    while (i<nums.length && j<nums.length) 
    {
      if (nums[i]%2==0) i+=2;
      
      else 
      {
        if (nums[j]%2!=0) 
        {
          j+=2 ;    
        } 
        else 
        {
         swap(nums, j, i);    
        }  
      }    
    }
  return nums;    
}
static void swap(int[] array, int j, int i) 
{
  int temp = array[j];
  array[j] = array[i];
  array[i] = temp;
} 
/*above sol is correct but IF ORDER NEED TO PRESERVE this is ans*/  
static int[] rearrangeArray(int[] nums) 
{
    int even = 0,odd = 1;
    int[] arr = new int[nums.length];
    for(int i: nums)
    {
      if(i > 0)
      {
        arr[even] = i;
        even+=2;
      }
      else
      {
       arr[odd] = i;
       odd+=2;
      }
    }
    return arr;
}
}