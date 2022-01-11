import math

#Area and Volume of Cube
def cube(a):
        radius = a
        area = 6 * a ** 2
        volume =  a ** 3
        print('Area of Cube  = ' , area)
        print('Volume of Cube =' , volume)
        
#Area and Volume of Sphere
def sphere(r):
        radius = r
        area = 4 * math.pi * r ** 2
        volume = (4/3) * math.pi * r**3
        print('Area of Sphere  = ',  area)
        print('Volume of Sphere = ',  volume)
        
cube(8)
sphere(10)