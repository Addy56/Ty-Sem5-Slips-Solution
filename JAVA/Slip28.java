/**Write a java program to count the number of integers from a given list. (Use
 Command line arguments). */

 public class Slip28 {
    static Boolean isInteger(String arg){
        if (arg == null) {
            return false;
        }
        try {
            Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        for(byte i = 0; i <args.length; i++) {
            if (isInteger(args[i]))
                count = count+1;
        }
        System.out.println("Number of integers: " + count);
    }
}
