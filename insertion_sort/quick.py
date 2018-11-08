from random import randint

def quick_sort(a):
    if len(a) <=1:
        return a
    else:
        pivot = a[0]
        less_subarray = []
        greater_subarray = []
        
        for i in range(1, len(a)):
            if a[i] < pivot:
                less_subarray.append(a[i])
            else:
                greater_subarray.append(a[i])
                
                
        quick_sort(less_subarray)
        quick_sort(greater_subarray)
        
        
        result = less_subarray[:]
        result.append(pivot)
        result.extend(greater_subarray)
    
    return result

a = [randint(1,1000) for i in range(15)]
print(a)
print(quick_sort(a))