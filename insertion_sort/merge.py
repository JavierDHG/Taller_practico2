from random import randint

def merge_sort(a):
    if len(a)==1:
        return a
    else:
        left_subarray=a[0]+a[n/2]
        right_subarray=a[(n/2)+1]+a[n]
        
        sortedL=merge_sort(left_subarray)
        sortedR=merge_sort(right_subarray)
        return merge_sort(sortedL,sortedR)
    
a = [randint(1,1000) for i in range(15)]
print(a)
print(merge_sort(a))