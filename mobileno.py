def mobile_number(number):
    if len(number)==10 and number[0] in "987":
        print("mobile_number", number, "is valid")
    else:
        print("mobile_number",number ,"is invalid")
number=str(input("Enter your mobile number:"))
mobile_number(number)
