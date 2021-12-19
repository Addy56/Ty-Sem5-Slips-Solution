//  A) Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method 
// Overloading)

/**
 * Area
 */
 class Area {
     final double pi = 3.14;
        double Areaof(int r){
            return (2*pi*r*r);
        }
        double Areaof(int w,int l){
            return (w*l);
        }
        double Areaof(int h,double b){
            return (h*b/2);
        }
}
class Slip18 {
    public static void main(String[] args) {
        Area shape = new Area();
        shape.Areaof(12);
        shape.Areaof(4,6);
        shape.Areaof(2,12);
    }
}
