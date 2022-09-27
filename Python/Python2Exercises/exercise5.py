# Δίνονται δύο λίστες ίσου μεγέθους που η πρώτη περιέχει immutable αντικείμενα.
# Χωρίς να χρησιμοποιήσετε τη συνάρτηση zip δημιουργήστε ένα λεξικό με κλειδιά από την πρώτη λίστα
# και τιμές από τη δεύτερη λίστα.
def zipLists(list1,list2):
    list3=[]
    for i in range(len(list1)):
        list3 += [(list1[i],list2[i])]
    dictionary = dict(list3)
    return dictionary

aList=["ΑΣΤΡΑ","ΠΛΑΝΗΤΕΣ","ΓΑΛΑΞΙΕΣ"]
bList=["ΗΛΙΟΣ","ΔΙΑΣ","ΑΝΔΡΟΜΕΔΑ"]

aDictionary=zipLists(aList,bList)

print(aDictionary)
