#  Write a Python function that accepts a string and calculate the number of upper case 
# letters and lower case letters. 
# Sample String : 'The quick Brow Fox'
# Expected Output :
# No. of Upper case characters : 3
# No. of Lower case Characters : 12

s ='The quick Brow Fox'
count_upper = [0]
count_lower = [0]
def check(i):
    if(i==" "):
        return
    if(i!=" "and i.isupper()):
        count_upper.insert(0,count_upper[0]+1) 
        return
    if(i!=" "and i.islower()):
        count_lower.insert(0,count_lower[0]+1)
        return
for i in s:
    check(i)
print("No. of Upper case characters:",count_upper[0])
print("No. of Lower case Characters:",count_lower[0])