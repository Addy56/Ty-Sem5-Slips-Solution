# Write a Python class named Student with two attributes student_name, marks. 
# Modify the attribute values of the said class and print the original and modified values of the said attributes.
class Student:
    student_name="tom"
    marks = 90
    def changethevalue(this,name,marks):
        print("original values:",this.student_name,this.marks)
        this.student_name = name
        this.marks = marks
        print("modified values:",this.student_name,this.marks)
obj = Student()
obj.changethevalue("wasim",100)