# B) Write a python script to generate Fibonacci terms using generator function.
def fibonacci():
    a=0
    b=1
    c=int(input("Enter the Number:-"))
    for _ in range(c):
        yield a
        a, b = b, a + b
    
print(list(fibonacci()))