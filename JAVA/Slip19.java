
    public class Slip19 {
    
        public static void main(String[] args) {
                System.out.print(0+","+1+",");
                Fibonacci(10);
        }
        public static void Fibonacci(int no){
                int fnum = 0;   
                int snum = 1;
                int sum=0;
            do {
                sum = fnum+snum;   
                System.out.print(sum+",");
                fnum = snum;
                snum = sum;
            }while(sum<no-fnum);

        }
        
    }
