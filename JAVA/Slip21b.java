import java.util.Hashtable;

// Create a hashtable containing city name & STD code. Display the details of the 
// hashtable. Also search for a specific city and display STD code of that city.


public class Slip21b {
    public static void main(String[] args) {
        // creating a hashtable object
        Hashtable<String,Integer> cities = new Hashtable<>();
        // inserting values in it
        cities.put("gujarat",123890);
        cities.put("bihar",345678);
        cities.put("pune",345678);
        cities.put("surat",347659);
        // trying to display it
        System.out.println("printing hashtable :"+cities);
    // trying for a search
        System.out.println("search for a specific city :"+cities.get("surat"));
    }
}
