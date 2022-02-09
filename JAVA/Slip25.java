
// Write a java program to check whether given string is palindrome or not.

public class Slip25 {
    public static void main(String[] args) {
        String name = "Ailia";
        String  rev = "";
        for (int i = name.length()-1; i >= 0; i--) {
            char temp = name.charAt(i);
            rev +=temp;
        }
        if(name.equalsIgnoreCase(rev)){
            System.out.println("name is palindrome:"+rev);
        }
        else{
            System.out.println("name is not palindrome:"+rev);
        }
    }    
}
