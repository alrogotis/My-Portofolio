# Ο χρήστης εισάγει μια συμβολοσειρά και το πρόγραμμα την τυπώνει αντίστροφα παρεμβάλλοντας ένα κενό ανάμεσα στους χαρακτήρες.

aString = input("Please insert a String: ")

def reverceWord(aString):
    bString = "" 

    for i in range(len(aString)-1,-1,-1):
        bString += aString[i]+ " "

    print(bString)
    
reverceWord(aString)


