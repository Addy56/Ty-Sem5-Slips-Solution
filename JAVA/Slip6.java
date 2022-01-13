import java.util.Scanner;

class ZeroException extends Exception{
     ZeroException(){
    super("Number is 0");
    }
}

    class Slip6{
    static int n;
    public static void main(String args[]){
        int rem,sum=0;
        try{
            System.out.println("enter a number");
            Scanner sr=new Scanner(System.in);
            n=sr.nextInt();
            sr.close();
            if(n==0){
                throw new ZeroException();
            }
            else{
                rem=n%10;
                sum=sum+rem;
                if(n>9){
                    while(n>0){
                        rem=n%10;
                        n=n/10;
                    }
                    sum=sum+rem;
                }
                System.out.println("Sum is: "+sum);
            }
        }
        catch(ZeroException e)
        {
            System.out.println(e);
        }
    }
}
