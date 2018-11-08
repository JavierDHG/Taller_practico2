from random import randint

def binary_search(a,x):
    lowerbound=0
    upperbound=len(a)-1
    index=-1
    
    while lowerbound < upperbound:
        middlepoint=(lowerbound+upperbound)/2
        if x==a[middlepoint]:
            index=middlepoint
            break
        else:
            if x < a[middlepoint]:
                upperbound=middlepoint-1
            else:
                lowerbound=middlepoint+1
    if lowerbound==upperbound and a[lowerbound]==x:
        index=lowerbound
        return index
    
        a = [randint(1,100) for i in range(15)]
        print(a,x)
        print(binary_search(a,x))