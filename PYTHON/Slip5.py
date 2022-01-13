#  Write a Python script using class, which has two methods get_String and 
# print_String. get_String accept a string from the user and print_String print the string in 
# upper case 

class Stringop:
    def get_String(this):
            this.str = input("enter the string")
        
    def print_String(this):
        print(this.str.upper())
    
object = Stringop()
object.get_String()
object.print_String()