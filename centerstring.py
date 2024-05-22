# Find center element of a string; returm "Cannot find center element of even string" if string length is even number
a ="spiderman"
s = int(len(a))
if(s%2 == 0):
    print("Cannot find center element of even string")
else:
    k = int(s/2 -0.5)
    print(a[k])