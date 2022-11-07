import java.util.Arrays;

public class AssignCookies 
{
public static void main(String[] args) 
{
    // g = [1,2,3], s = [1,1]
    int[] arr = {1,2,3};
    int[] arr1 = {3};

    System.out.println(findContentChildren(arr, arr1));
}

static int findContentChildren(int[] g, int[] s) 
{
  Arrays.sort(g);
  Arrays.sort(s);

  int i = 0;
  int j = 0;
  int assigned = 0;
 

  while(i < g.length && j < s.length) 
  {
    if (s[j] >= g[i])
    {
        assigned++;
        i++; j++;
    }
    else {j++;} ;
  }  
  return assigned;
}

static int greedyway(int[] g, int[] s) 
{
  Arrays.sort(g);
  Arrays.sort(s);

  int assigned = 0;
  for(int j = 0 ; assigned < g.length && j <s.length ; j++) 
  {
    // if(g[i]<=s[j])
    if (s[j] >= g[assigned])
    {
        assigned++ ;
    }   
  }

  return assigned;    
}
}