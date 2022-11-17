import java.util.Arrays;

public class SortByBits 
{
public static void main(String[] args) 
{
    int[] arr = {0,1,2,3,4,5,6,7,8};

  arr[2] += Integer.bitCount(arr[2])*10001;
  System.out.println(arr[2]);
  System.out.println(arr[1] = arr[1] %10001);
}


static int[] sortingBit(int[] arr)
{
 for ( int i =0 ;i< arr.length ;i++)
 {
  arr[i] += Integer.bitCount(arr[i])*10001;
 }
 
 Arrays.sort(arr);
 for ( int i =0 ;i< arr.length ;i++)
 {
  arr[i] = arr[i] %10001;
 }
 return arr;
}
}