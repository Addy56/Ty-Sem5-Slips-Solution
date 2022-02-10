
import java.util.InputMismatchException;
import java.util.Scanner;

/**Write a java program to accept a number from a user, if it is zero then throw user
defined Exception "Number is Zero". If it is non-numeric then generate an error
"Number is Invalid" otherwise check whether it is palindrome or not.  */

class NumberIsZero extends Exception{
    NumberIsZero() {
        super("Number is zero");
    }
}

class NumberIsInvalid extends Exception{
    NumberIsInvalid() {
        super("Number is invalid");
    }
}

public class Slip30 {
   
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            num = s.nextInt();
            s.close();

            if(num == 0)
                throw new NumberIsZero();
            else{
                int temp = num, rev=0, rem=0;

                while (temp>0){
                    rem = temp % 10;
                    rev = rev*10 +rem;
                    temp = temp / 10;
                }

                if(num == rev) System.out.println(num + " is a Palindrome");
                else System.out.println(num + " is not a Palindrome");
            }
           
        } catch (NumberIsZero e) {
                System.out.println(e);
        } catch (InputMismatchException e){
            System.out.println(new NumberIsInvalid());
        }
       
       
    }
}
