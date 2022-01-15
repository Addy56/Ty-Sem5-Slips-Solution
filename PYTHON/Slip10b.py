#  Write a Python class to find validity of a string of parentheses, '(', ')', '{', '}', '[' ']’. 
# These brackets must be close in the correct order. for example "()" and "()[]{}" are 
# valid but "[)", "({[)]" and "{{{" are invalid.


class Validity:
    def __init__(this,string):
        this.str = string
    def check_algo(this):
        valid = False    
        for i in range(0,len(this.str)):
            ind_char = this.str[i] 
            if((i+1)==len(this.str)):
                next_char = 0
            else:
                next_char = this.str[i+1]
            if(i==0 or i%2==0):
                if(ind_char == '('and next_char==')'):
                    valid = True
                elif(ind_char == '{'and next_char=='}'):
                    valid = True
                elif(ind_char == '['and next_char==']'):
                    valid = True
                else:
                    valid = False
            else:
                continue
        return valid
obj = Validity("(((({{{{")
valid = obj.check_algo()
print(valid)