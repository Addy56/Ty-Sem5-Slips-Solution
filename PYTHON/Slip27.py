# Write a Python program to unzip a list of tuples into individual lists.
list_a = [(10,20),(30,40,40,70,70),(10,200)]
print("original list:",list_a)
list = []
for i in list_a:
    for j in range(0,len(i)):
        ele = i[j]
        list.append(ele)
print("after:",list)