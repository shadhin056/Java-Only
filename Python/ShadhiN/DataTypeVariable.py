a=int(10.5);
print(type(a))
print(a)
print(".......................................\n")


b=round(10.6)
print(type(b))
print(b)
print(".......................................\n")


c="This is a string"
print(type(c),"\n",c)
print(".......................................\n")


d='''\
     \


    This
    is
    a
    String
    Also
'''
print(type(d),d)
print(".......................................\n")



e="Hello"
f="This a %s program" % e

print(f)
print(".......................................\n")

g="Shadhin"
h="My Name is {}".format(g)
print(h)
print(".......................................\n")

i=(1,2,3,4)
print(type(i),i)
#tuple can not modify ,only list can be modified
print(".......................................\n")

j=[1,2,3,4,5,6,7,8]
j.append(9)
print(type(j),j)
print(".......................................\n")

k= {'one':1,'two':2}
print(type(k),k)
print(".......................................\n")


dict = {}
dict['one'] = "This is one"
dict[2]     = "This is two"

tinydict = {'name': 'john','code':6734, 'dept': 'sales'}


print (dict['one'])       # Prints value for 'one' key
print (dict[2])           # Prints value for 2 key
print (tinydict)          # Prints complete dictionary
print (tinydict.keys())   # Prints all the keys
print (tinydict.values()) # Prints all the values
print(".......................................\n")
    
boolean =False
print(type(boolean),boolean)

