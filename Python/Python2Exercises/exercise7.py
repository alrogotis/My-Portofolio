# Δημιουργήστε μια συνάρτηση που δέχεται μια συμβολοσειρά
# και επιστρέφει ένα λεξικό με κλειδιά τους χαρακτήρες της συμβολοσειράς.
# Π.χ. για τη συμβολοσειρά supercalifragilistcexpialidocious το αποτέλεσμα είναι
# {'s': 3, 'u': 2, 'p': 2, 'e': 2, 'r': 2, 'c': 3, 'a': 3, 'l': 3, 'i': 6, 'f': 1, 'g': 1, 't': 1, 'x': 1, 'd': 1, 'o': 2}
def creaDict(aString):

    bString=""
    aList=[]
    bList=[]
    metritis=0

    for i in range(len(aString)):
        for j in range(len(bString)):
            if aString[i] == bString[j]:
                metritis += 1
        if metritis == 0:
            bString += aString[i]
        metritis = 0

    for i in range(len(bString)):
        aList += bString[i]

    for i in range(len(bString)):
        for j in range(len(aString)):
            if bString[i] == aString[j]:
                metritis += 1
        bList += [metritis]
        metritis = 0

    aDictionary = dict(zip(aList, bList))
    return aDictionary

aString="supercalifragilistcexpialidocious"

aStringDict=creaDict(aString)

print(aStringDict)





