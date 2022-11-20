import java.util.Arrays;

public class AvgSalaryExcludingMaxAndMin 
{
public static void main(String[] args) 
{
 int[] array = {4000,3000,1000,2000};
 System.out.println(excludingTwo(array));

System.out.println(Arrays.toString(array));
}
static double excludingTwo(int[] salary)
{
 int sum = 0;

 Arrays.sort(salary);
 for (int i = 1; i < salary.length-1; i++) 
 {
    sum+=salary[i];
 }
 return (sum)/((salary.length-2)*1.0);
}    
}
