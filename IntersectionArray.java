import java.util.Arrays;

/**
 * Intersection of two array Array 
 * output a new array with common element in both array 
 */
public class IntersectionArray 
{
public static void main(String[] args) 
{
  int[] arr1 = {4,9,5} ;
  int[] arr2 = {9,4,9,8,4};
  System.out.println(Arrays.toString(intersection(arr1, arr2))); 
}
public static int[] intersection(int[] nums1 , int[] nums2) 
{
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    int i = 0, j = 0;
    
    while(i < nums1.length && j < nums2.length)
    {
        if (nums1[i] < nums2[j]) {
            i++;
        } else if (nums1[i] > nums2[j]) {
            j++;
        }
         else 
        {
           
           i++;
           j++;
        }
    }

  return new int[] {-1,-1} ;    
}    
}
/*  List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++) list1.add(nums1[i]);
        for(int j=0;j<nums2.length;j++) 
          if(list1.contains(nums2[j]) && list2.contains(nums2[j])==false)
           list2.add(nums2[j]);
        int ans[]=new int[list2.size()];
        for(int i=0;i<list2.size();i++) ans[i]=list2.get(i);
        return ans;
 */