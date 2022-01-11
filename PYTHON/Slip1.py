#slip 1 - A
#defining function 
def R(duplicate):
    f_list = [] #create empty list 
    for no in duplicate:
        if no not in f_list: # it will check if no is present or not in f_list and if no is not there it will append.
            f_list.append(no)
    return f_list
# providing list 
duplicate = [1, 3, 5, 3, 6, 7, 6, 3, 2, 8, 7, 19, 2, 7]
print(R(duplicate)) #printing main list