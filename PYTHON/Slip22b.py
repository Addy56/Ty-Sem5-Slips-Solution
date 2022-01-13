# Write a python script to implement bubble sort using list 

list = [1,2,2,32,323,23,23,22,8,7,56,1,2,3,4,5]

for i in list:
    for j in range(0,len(list)-1):
        if(list[j]>list[j+1]):
            temp = list[j]
            list[j]=list[j+1]
            list[j+1]=temp
print(list)