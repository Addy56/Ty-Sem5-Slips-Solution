
/**Write a java program to accept a number from user, If it is greater than 1000 then
throw user defined exception "Number is out of Range" otherwise display the factors of
that number. (Use static keyword) */


// note: exception in class is object
import java.util.Scanner;

class NumberOutOfRangeException extends Exception{
    NumberOutOfRangeException(int num) {
        super(num+ " is out of range!!!");
    }    
}

public class Slip27 {
    static int num;
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = s.nextInt();
            s.close();

            if(num>1000)
                throw new NumberOutOfRangeException(num);
            else {
                System.out.println("Factors of: " + num);
                for (int i = 1; i <= num; i++){
                    if (num % i == 0){
                        System.out.print(i+" ");
                    }
                }
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }    
}
