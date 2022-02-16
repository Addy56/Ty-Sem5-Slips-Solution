import java.util.Scanner;

// Define a class Product (pid, pname, price, qty). Write a function to accept the product 
// details, display it and calculate total amount. (use array of Objects)

class Product {
    int pid;
    String pname;
    int price;
    int qty;
    static double total;

    public void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter product Name");
        this.pname = s.nextLine();
        System.out.println("enter product Id");
        this.pid = s.nextInt();
        System.out.println("enter product price");
        this.price = s.nextInt();
        System.out.println("enter product quantity");
        this.qty = s.nextInt();
    }

    public void putdata() {
        total += price * qty;
        System.out.println(pname+"\t\t"+ pid+"\t\t"+ price+"\t\t"+ qty+"\t\t"+total);
    }
}

public class Slip17b {
    public static void main(String[] args) {
        System.out.println("Enter total No of Products");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Product p[] = new Product[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Product();
            p[i].getdata();
        }
        System.out.println("product name \t Product Id \t Product Price \t product Quantity \t Total");

        for (int i = 0; i < n; i++) {
            p[i].putdata();
        }
        s.close();

    }
}
