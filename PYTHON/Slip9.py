# A) Write a Python script using class to reverse a string word by word
class py_solution:

    def reverse_words(self, s):

        return ' '.join(reversed(s.split()))

print(py_solution().reverse_words('hello .doc'))