def gcd(num1 ,num2):
    if num1%num2==0:
        return num2
    else:
        return gcd(num2,num1%num2)
num1=int(input("enter your number"))
num2=int(input("enter your number"))
if num1>0 and num2>0:
    print(f"the greatest common divisor of {num1} and {num2} is :",gcd(num1,num2))
else:
    print("enter positive numbers")
