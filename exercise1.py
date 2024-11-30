'''max of three numbers'''
def max_of_two(a,b):
    if a>b:
        return a
    else:
        return b
def max_of_three(a,b,c):
    return max_of_two(a,max_of_two(b,c))

a=int(input("enter first number"))
b=int(input("enter second number"))
c=int(input("enter third number"))
print("the maximum in the three numbers is",max_of_three(a, b, c))