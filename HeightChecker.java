import java.util.Arrays;

public class HeightChecker 
{
public static void main(String[] args) 
{
  int[] check = {1,1,4,2,1,3};
//   int[] check = {5,1,2,3,4};
  System.out.println(heightChecker(check));
  System.out.println(Arrays.toString(check));  
}
static int heightChecker(int[] heights) 
{
  int[]  ordered = Arrays.copyOf(heights, heights.length);
  Arrays.sort(ordered);
  
  int outOfOrder = 0;
  for (int i = 0; i < ordered.length; i++) 
  {
    if (ordered[i] != heights[i])
       outOfOrder++;
  }
  
  return outOfOrder;
}
    
}