# Μια συνάρτηση δέχεται σαν παραμέτρους μια συμβολοσειρά και ένα θετικό ακέραιο k.
# Αν ο ακέραιος είναι μεγαλύτερος ή ίσος από το μήκος της συμβολοσειράς η συνάρτηση επιστρέφει τη συμβολοσειρά
# αλλιώς επιστρέφει τη συμβολοσειρά χωρίς τους πρώτους k χαρακτήρες.
#Ο χρήστης εισάγει μια συμβολοσειρά και ένα θετικό ακέραιο και το πρόγραμμα τυπώνει στην οθόνη το αποτέλεσμα της κλήσης της συνάρτησης (input, int, functions, list slicing).

def differs(aString,k):

    bString=""

    if ( k >= len(aString) ):
        print(aString)
    else:
        
        for i in range(k,len(aString)):
            bString+=aString[i]
        print(bString)

aString= input("Please insert a string: ")
k= int(input("Please insert an interger: "))

differs(aString,k)


