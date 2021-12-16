public class Slip16 
{
    public static void main(String[] args) 
    {
        int a = add(123);
        System.out.println("Sum:"+a);
    }
    public static int add(int n)
    {
        int sum = 0;
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + add(n / 10);
        }
 
    }
}