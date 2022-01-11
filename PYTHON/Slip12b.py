#slip 12 - b

string = "thequickbrownfoxjumpsoverthelazydog" 
a = len(string)
print("Duplicate characters in a given string: ");  
for i in range(0, a):   #used to select a character and initialize variable count to 1.
    count = 1;  
    for j in range(i+1, a):  #used to compare the selected character with remaining characters of the string.
        if(string[i] == string[j] and string[i] != ' '):  
            count = count + 1;   #If a match found, it increases the count by 1.
            string = string[:j] + '0' + string[j+1:];  
    
    if(count > 1 and string[i] != '0'):  #printing the repeated character
        print(string[i]," - ",count);