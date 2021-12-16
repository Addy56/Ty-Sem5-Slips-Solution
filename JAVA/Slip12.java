import java.util.Scanner;
 
class Slip12 {
    public static void main (String[] args) {
        System.out.println("enter no of strings to store:");
        Scanner s1 =new Scanner(System.in);
        int  no_of_ele =  Integer.parseInt(s1.nextLine());
        String array[] = new String[no_of_ele];
        String rev_array[] = new String[no_of_ele];
        String rev_str="";
        char ch;

        for (int i = 0; i < no_of_ele; i++) {
            System.out.println("enter next String:");
            array[i]=s1.nextLine();
        }
        s1.close();
        // getting inside array and reversing it
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            
            for (int j = str.length()-1; j>=0 ; j--) {
                if (str.charAt(j)==' ') continue;
                ch=str.charAt(j); //extracts each character
                rev_str+= ch;
            }
            rev_array[i] = rev_str;
            rev_str = "";
        }
        // printing reversed array
        for (int i = 0; i < rev_array.length; i++) {
            System.out.println(rev_array[i]);
        } 
    }
}
 