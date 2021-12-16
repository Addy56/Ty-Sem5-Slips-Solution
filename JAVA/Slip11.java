public class Slip11{
    public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[2]);
    int sum = 0;
    switch (args[1]) {
        case "+":
            sum = a+b;
            break;
        case "-":
            sum = a-b;
            break;
        case "/":
            sum=a/b;
            break;
        case "*":
            sum=a*b;
            break;
        default:
            break;
    }
    System.out.println("The sum is"+" "+sum);
    }
    }