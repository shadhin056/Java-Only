tuple =(1,2,3,4,5)
try:
    tuple.append(6)
except AttributeError as  e:
    print("Error found",e)
else:
    for each in tuple:
        print(each)