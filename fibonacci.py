def generate_fibonacci(num):
    a=0
    b=1
    for i in range(num):
        print(a,end=",")
        a,b=b,b+a

