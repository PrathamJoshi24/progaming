"Calculator.py"

#better calculator
def final_awnser(question):
    while True:
        try:
            try:
                first=float(question[-3])
                second=float(question[-1])
                otp=question[-2]
                try:
                    if otp=="/":
                        awnser=first/second
                        print(awnser)
                        break
                except ZeroDivisionError:
                    print("cannot be divided by zero")
                    break
                if otp=="*":
                    awnser=first*second
                    print(awnser)
                    break
                elif otp=="+":
                    awnser=first+second
                    print(awnser)
                    break
                elif otp=="-":
                    awnser=first-second
                    print(awnser)
                    break
                elif otp=="**":
                    awnser=first**second
                    print(awnser)
                    break
                elif otp=="//":
                    awnser=first//second
                    print(awnser)
                    break
                else:
                    print("i dont understand that")
                    print("try again")
            except IndexError:
                print("add spaces...")
                break
        except ValueError:
            print("add spaces after each character")
            break
