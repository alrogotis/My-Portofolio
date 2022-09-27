# Ο χρήστης εισάγει μια συμβολοσειρά και το πρόγραμμα ελέγχει αν είναι παλίνδρομη
# (διαβάζεται το ίδιο από την αρχή προς το τέλος και από το τέλος προς την αρχή, π.χ. αννα). Στην οθόνη τυπώνεται ανάλογο μήνυμα.

def checkPalindrom(aString):

    bString= ""

    for i in range (len(aString)-1,-1,-1):
        bString+=aString[i]
        
    if (aString==bString):
        print(f"Η λέξη: {aString} είναι παλίνδρομη")
    else:
        print(f"Η λέξη: {aString} δεν είναι παλίνδρομη")

aString = input("Please insert a string: ")

checkPalindrom(aString)
