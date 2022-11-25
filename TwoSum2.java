import java.util.Arrays;

public class TwoSum2 
{
public static void main(String[] args) 
{
 int[] array = {2,3,4};
 System.out.println(Arrays.toString(Optimize(array, 6)));
}

static int[] BestSolution(int[] numbers, int target) 
{
int start = 0 , end = numbers.length-1;
while(numbers[start] + numbers[end]!=target) 
{  
 if (numbers[start] + numbers[end]<target) start++; 
 
 else end-- ;
}
return new int[] {start+1,end+1};
}

static int[] twoSum(int[] numbers, int target) 
{
 for (int i = 0; i < numbers.length; i++) 
 {
  for (int j = i+1; j < numbers.length; j++) 
  {
    if (numbers[i]+numbers[j] == target) 
    {
     return new int[] {i+1, j+1};
    }
  }   
 } 
 return new int[0];
}


static int[] Optimize(int[] numbers, int target)
{
int start = 0 , end = numbers.length-1;
while(start<=end) 
{
 int sum = numbers[start] + numbers[end];
 
 if (sum == target) return new int[] {start+1, end+1};

 if (sum<target) start++ ;

 else end-- ;
}   
return new int[] {-1};    
}
}
