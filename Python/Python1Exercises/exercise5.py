# Ο χρήστης εισάγει (σαν συμβολοσειρά) μια σειρά ακέραιων αριθμών που χωρίζονται μεταξύ τους με ένα κενό διάστημα.
# Μια συνάρτηση δέχεται σαν παράμετρο τη σειρά των ακέραιων και τη χαρακτηρίζει "δεκτή" αν ο πρώτος και ο τελευταίος αριθμός είναι ίσοι,
# αλλιώς την χαρακτηρίζει "απαράδεκτη". Το πρόγραμμα τυπώνει στην οθόνη το χαρακτηρισμό (input, int, functions, string split).

def characterism(stringNumbers):
    characterism = ""
    aList=stringNumbers.split()

    if aList[0] == aList[len(aList)-1]:
        characterism = "δεκτή"
    else:
        characterism = "απαράδεκτη"
        
    print(characterism)

stringNumbers = input("Please insert interger numbers with a space between: ")

characterism(stringNumbers)
