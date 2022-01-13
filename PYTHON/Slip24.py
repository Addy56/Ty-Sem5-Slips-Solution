# Write a Python Program to Check if given number is prime or not. Also find 
# factorial of the given no using user defined function
num = 11
if num > 1:
   for i in range(2, int(num/2)+1):
 
        if (num % i) == 0:
            print(num, "is not a prime number")
            break
        else:
            print(num, "is a prime number")
  
else:
    print(num, "is not a prime number")

def fact(no):
    if(no==0):
        return 1
    else:
        sum = no*fact(no-1)
        return sum
print(fact(5))  