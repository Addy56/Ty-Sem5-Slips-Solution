# Write a Python script to sort (ascending and descending) a dictionary by key and value.

d={1:2,3:4,4:3,2:1,0:0}
print("original dictionary:",d)
l=list(d.items())
l.sort()
print("assinding order:",dict(l))
l.sort(reverse=True)
print("descending order:",dict(l))