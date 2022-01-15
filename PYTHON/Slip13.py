#  Write a Python program to input a positive integer. Display correct message for 
# correct and incorrect input. (Use Exception Handling)

no = int(input("enter a number"))

if(no<0):
    raise Exception("entered number is negative")
else:
    print("no:",no)