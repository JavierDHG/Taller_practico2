from random import randint

def merge(a,b):
    l=len(a)+len(b)
    c=len(l)
    indexa=0,indexb=0,indexc=0
    
    while a and b:
        if a[indexa] < b[indexb]:
            c[indexc]=a[indexa]
            indexa=indexa+1
            indexc=indexc+1
    while a:
        c[indexc]=a[indexa]
        indexa=indexa+1
        indexc=indexc+1
    while b:
        c[indexc]=b[indexb]
        indexb=indexb+1
        indexc=indexc+1    
        
        a = [randint(1,1000) for i in range(15)]
        print(a)
        print(merge(a,b))