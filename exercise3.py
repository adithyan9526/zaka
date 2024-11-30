'''multiplication of numbers in a set of numbers'''
def multiplication(numbers):
    total=1
    for x in numbers:
        total*=x
    return total
print(multiplication((2,4,5,)))