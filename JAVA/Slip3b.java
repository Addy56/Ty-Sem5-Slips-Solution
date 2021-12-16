abstract class Shape
{
     double r, h;
     Shape(double r, double h)
     {
          this.r = r;
          this.h = h;
     }
     abstract double calcArea();
     abstract double calcVolume();
}

class Sphere extends Shape
{
     Sphere(double r)
     {
          super(r, 0);
     }
     double calcArea()
     {
          return 4*3.14*r*r;
     }
     double calcVolume()
     {
          return 4*3.14*Math.pow(r,3)/3;
     }
}

class Cone extends Shape
{
     Cone(double r, double h)
     {
          super(r, h);
     }
     double calcArea()
     {
          return 3.14*r*(r+Math.sqrt(r*r+h*h));
     }
     double calcVolume()
     {
          return 3.14*r*r*h/3;
     }
}

class Cylinder extends Shape
{
     Cylinder(double r, double h)
     {
          super(r, h);
     }
     double calcArea()
     {
          return 2*3.14*r*(h+r);
     }
     double calcVolume()
     {
          return 3.14*r*r*h;
     }
}


public class Slip3b {
public static void main(String[] args) {
     
     Shape shape = new Sphere(21);
     System.out.print(shape.calcArea());
}
}
