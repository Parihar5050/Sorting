public class NumberOf1Bit 
{
public static void main(String[] args) 
{
System.out.println(count(00000000000000000000000000001011));
System.out.println(sumProduct(234));
}

static int sumProduct(int n) 
{
 int product = 1;
 int sum = 0;

 while (n>0) 
 {
  int digit = n%10;
  n/=10;
  product*=digit;
  sum+=digit;
 }
 return product-sum;
}

static int count(int n) 
{
 String s = Integer.toBinaryString(n).replaceAll("0", "");
 return s.length();
}

}
