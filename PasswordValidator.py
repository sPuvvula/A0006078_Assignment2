attempt = 0
success = False

while True:
    passcode = input("PIN: ")
    attempt += 1

    if code == "4321":
        success = True
        break

    elif attempt == 1:
        print("Correct! It only took you one try!")
        break

    print("Wrong")

if success == True:
    print("Correct! It took you {attempt} attempts")