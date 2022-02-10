import java.util.*;

public class Slip20b {
    public static void main(String[] args) {

        LinkedList<String> l1 = new LinkedList<String>();

        l1.add("CPP");
        l1.add("JAVA");
        l1.add("PYTHON");
        l1.add("PHP");

        // System.out.println("Original linked list:" + l1);

        Iterator<String> i =l1.iterator();
        while (i.hasNext())
        {
        System.out.println(i.next());
        }
        ListIterator k1= l1.listIterator();
        while (k1.hasNext()) {
            k1.next();
        }
        System.out.println("Elements in Reverse Order:");
        while (k1.hasPrevious()) {
            System.out.println(k1.previous() + "");
        }
    }
}