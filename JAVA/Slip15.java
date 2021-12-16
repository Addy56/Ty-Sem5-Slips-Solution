// Write a java program to search given name into the array, if it is found then display 
// its index otherwise display appropriate message.

public class Slip15 {
    public static void main(String[] args) {
        String array[] = {"amish","rohit","alpesh","ram","shayam"};
        String given_name = "haha";
        boolean found_or_not = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==given_name){
                System.out.println("name found at index number:"+" "+i);
                 found_or_not=true;
                 break;
            }
        }
        if(found_or_not==false) System.out.println("not found");
    }    
}
