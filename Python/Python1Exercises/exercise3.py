# Ο χρήστης εισάγει μια συμβολοσειρά και το πρόγραμμα τυπώνει στην οθόνη τους χαρακτήρες
# που βρίσκονται στις ζυγές θέσεις της συμβολοσειράς (input, len, range ή list slicing).

def evenStringLetters(aString):
    for i in range(len(aString)):
        if i%2 == 0 :
            print(aString[i])

aString = input("Please insert a word: ")

evenStringLetters(aString)
