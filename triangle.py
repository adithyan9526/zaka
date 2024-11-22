print("increasing triangle")
for i in range(6):
    for j in range(i,i+1):
        print(j*'*')


print("decreasing triangle")

for i in range(5,0,-1):
    for j in range(1):
        print(j*'*')

print("hill pattern")
for i in range (1,5+1):
    for j in range(5-i):
        print(" ",end="")

    for k in range(2*i-1):
            print('*',end="")
    print()

print("revers hill pattern")
for i in range (5,0,-1):
    for j in range(5-i):
        print(" ",end="")

    for k in range(2*i-1):
            print('*',end="")
    print()