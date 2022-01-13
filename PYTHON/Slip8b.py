#  Write a Python class which has two methods get_String and print_String. get_String 
# accept a string from the user and print_String print the string in upper case. Further 
# modify the program to reverse a string word by word and print it in lower case.
class Math:
    def get_String(this,str):
        this.str= str
    def print_String(this):
        print(this.str.upper())
obj = Math()
obj.get_String("tommy")
obj.print_String()
