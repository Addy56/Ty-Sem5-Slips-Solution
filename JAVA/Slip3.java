import java.util.*;

    public class Slip3 
{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n,copy,remainder,sum=0;
		System.out.println("Enter the number");

    		n=scanner.nextInt();
            	copy=n;
				scanner.close();
               while(copy!=0)
    	       {
			remainder=copy%10;
       	 		sum=sum+remainder*remainder*remainder;
		        copy=copy/10;
    		}

		if(sum==n) System.out.println(n+" is an Armstrong number");
    		else System.out.println(n+" is not an Armstrong number");
	}
	
}

