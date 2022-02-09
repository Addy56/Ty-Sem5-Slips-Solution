public class Slip22 {
    public static void main(String[] args) {
        int sum = fact(10);
        System.out.println("factorial of number is:"+sum);
    }   
    public static int fact(int no){
        if(no==0){
            return 1;
        }else{
            return(no*fact(no-1));
        }
    }
}
