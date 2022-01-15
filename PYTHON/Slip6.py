import math

#Area and Volume of Cube
#impotr math package to use math.pi for the value of PI

import math

#take radius  from user

r=float(input("Enter the r of a sphere"))

#calculate the surface area of sphere

s_area=4*math.pi*pow(r,2)

print("surface area of the sphere wll be %.2f" %s_area)

#calculate the volume of sphere

volume=(4/3)*math.pi*pow(r,3)

print("volume of the sphere will be  %.2f" %volume)

#calculate the  area of cube

av=6*pow(r,2)

print("area of cube %.2f" %av)

#calculate the  volume of cube

vc=pow(r,3)

print("volume of cube %.2f" %vc)

