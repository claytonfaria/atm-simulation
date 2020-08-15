import os


def showMenu():
    print("*********MENU*********")
    print("1. Check balance")
    print("2. Deposit")
    print("3. Withdraw")
    print("4. Exit")
    print("**********************")


option = 0
balance = 500

while option != 4:
    showMenu()
    option = int(input("Option: "))
    # os.system('cls||clear')
    os.system('cls' if os.name == 'nt' else 'clear')

    if option == 1:
        print(f"Balance is: {balance}")
    elif option == 2:
        depositAmount = int(input("Deposit Amount: "))
        balance += depositAmount
    elif option == 3:
        withdrawAmount = int(input("Withdraw Amount: "))
        balance -= withdrawAmount
    elif option == 4:
        print("Exiting...")
    else:
        print("Invalid entry, try again")
