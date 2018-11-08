from random import randint

def bynary_search_recursive(a,x,ib,ub):
    middlepoint=(ib+ub)/2
    if ib==ub:
        if x==a[middlepoint]:
            return middlepoint
        else:
            return -1
    else:
        if x==a[middlepoint]:
            return  middlepoint
        else:
            if x < a[middlepoint]:
                return bynary_search_recursive(a,x,ib,middlepoint)
            else:
                return bynary_search_recursive(a,x,middlepoint+1)
            
        a = [randint(1,100) for i in range(15)]
        x=21
        ib=len(a)-1
        ub=0
        search=(bynary_search_recursive(a,x))
        if search==-1:
            print("No se encuentra el elemento")
        else:
            print(search)     