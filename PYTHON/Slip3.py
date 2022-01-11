dict = {'a':100, 'b':200, 'c':300, 'd':400, 'e':500}
print("Orginial Dict :",dict)
def abc(key):
    x = key
    if x in (dict.keys()):
        print("Key is Present")
        dict['y'] = dict.pop(x)
        dict["y"] = 600
        print("Replace done")
        print("Replaced Dict :" ,dict)
    else:
        print("Not Present")
        
abc('b')