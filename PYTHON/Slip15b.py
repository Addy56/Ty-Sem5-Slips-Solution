def odd_values_string(str):
    result = "" 
    for i in range(len(str)):
        if i % 2 == 0:
            result = result + str[i]  
            #If the index is odd, the empty character variable appended to the string thus indirectly removing the character.
    return result

print(odd_values_string('python'))