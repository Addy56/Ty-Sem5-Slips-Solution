import java.lang.Math;

public class Slip17  
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
return true;      
else return false;   
}   
//driver code  
public static void main(String args[])     
{     
int array[] = new int[args.length];   

//reads the limit from the user  
    int ind =0;
    for(int i=0; i<args.length; i++){
         int num = Integer.parseInt(args[i]);
        if(isArmstrong(num)){
            array[ind] = num;
            ind++;
        } 

    }  

// printing all armstrong numbers
    System.out.println("armstrong numbers are :");

    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
    }   
}  