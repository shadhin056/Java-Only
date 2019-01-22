a=75
while a>50:
    print(a ,'',end="")
    a=a-1
print()
for data in [10,20,30,40,50]:
    print(data)

length=0
for x in "string":
    length+=1
print(length)

for data in 'string':
    if(length % 2 == 0):
        print(data)
    length=length-1
   
    
    
    
    
for le in 'Python':     # traversal of a string sequence
   print ('Current Letter :', le)
print()
fruits = ['banana', 'apple',  'mango']
for fruit in fruits:        # traversal of List sequence
   print ('Current fruit :', fruit)

print ("Good bye!")