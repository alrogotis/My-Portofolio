# Ο χρήστης εισάγει δύο θετικούς ακέραιους αριθμούς
# και υπολογίζεται το γινόμενό τους αν αυτό είναι
# μικρότερο του 1000, αλλιώς υπολογίζεται το άθροισμά τους (input, int, if statement).

def numResult(numA,numB):
    
    if (numA * numB) < 1000 :
        numResult = numA * numB
    else:
        numResult = numA + numB
    print(numResult)

numA = int(input("Please enter an positive interger number: "))
numB = int(input("Please enter another positive interger number: "))

numResult(numA,numB)
