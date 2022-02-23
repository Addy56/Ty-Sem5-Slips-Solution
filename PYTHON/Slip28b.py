# Write a Python program to accept two lists and merge the two lists into list of tuple
list_a = []
list_b = []
print("number of elements to enter in first list")
no = int(input())
print("enter first list of elements")
for i in range(0,no):
    ele = int(input())
    list_a.append(ele) 
print("number of elements to enter in second list")
no = int(input())
print("enter second list of elements")
for i in range(0,no):
    ele = int(input())
    list_b.append(ele) 
print("list_a:",list_a)
print("list_b:",list_b)
print("merge of both:",list(zip(list_a, list_b)))
