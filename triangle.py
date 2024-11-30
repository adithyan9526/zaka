def check_right_triangle(sides):
    sides.sort()
    if sides[2]**2==sides[0]**2+sides[1]**2:
        return True
    return False
sides=[]
sides.append(int(input("enter side one")))
sides.append(int(input("enter side two")))
sides.append(int(input("enter side three")))
if check_right_triangle(sides):
    print("the given sides are part of right triangle")
else:
    print("the given sides are not the part of right triangle")

