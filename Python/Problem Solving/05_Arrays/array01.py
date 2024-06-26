"""
Value equal to index value
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

Example 1:

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:

Input: 
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[] and n as parameters and returns an array of indices where the given conditions are satisfied. When there is no such element exists then return an empty array of length 0. For C users, you need to modify the array(arr), in place such that the indices not in the final answer should be marked 0.

"""
arr = [11,2,22,4]
n= 4
exist = False
result = []
for i in range(n+1):
    for a in arr:
        if i == a:
            # print(arr.index(a))
            result.append(a)
            exist = True
if(exist):
    print(result)
else:
    print('doesnt exist')