# Ο χρήστης εισάγει (σαν συμβολοσειρά) μια σειρά ακέραιων αριθμών που χωρίζονται μεταξύ τους με το χαρακτήρα ",".
# Στη συνέχεια ο χρήστης εισάγει ένα θετικό ακέραιο k. Το πρόγραμμα εκτυπώνει στην οθόνη τους αριθμούς της δοσμένης σειράς
# που διαιρούνται ακριβώς με τον k (η διαίρεση δεν αφήνει υπόλοιπο) (input, int, string split, for statement).

def printMod0Letters(numString,k):
    numList = numString.split(',')
    
    for i in range(0,len(numList)):
        
        if (k%int(numList[i])==0):
            print(numList[i])


numString = input("Please insert a string of number with a ',' between them ")
k = int(input("Please insert an interger number "))

printMod0Letters(numString,k)


