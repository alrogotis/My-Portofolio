# Δίνονται δύο λίστες ίσου μεγέθους που περιέχουν συμβολοσειρές.
# Χωρίς να χρησιμοποιήσετε τη συνάρτηση zip εκτυπώστε μια νέα λίστα με συμβολοσειρές
# όπου στη θέση i η συμβολοσειρά προκύπτει από τη συνένωση της συμβολοσειράς στη θέση i
# της πρώτης λίστας με τη συμβολοσειρά στη θέση i της δεύτερης λίστας.
def zipLists(list1,list2):
    list3=[]
    aString=""
    for i in range(len(list1)):
        aString += list1[i]+list2[i]
        list3 += [aString]
        aString = ""
    return list3

aList=["ΑΣΤΡΑ","ΠΛΑΝΗΤΕΣ","ΓΑΛΑΞΙΕΣ"]
bList=["ΗΛΙΟΣ","ΔΙΑΣ","ΑΝΔΡΟΜΕΔΑ"]

cList=zipLists(aList,bList)

print(cList)