# Εκτυπώστε ανάποδα μια δοσμένη λίστα, χωρίς να χρησιμοποιήσετε τη μέθοδο reverse ή τη συνάρτηση reversed.
aList = [12,4,6,8,2]

def reverseList(aList):
    bList=[]
    for i in range(len(aList)-1,-1,-1):
        bList+=[aList[i]]
    
    print(bList)

reverseList(aList)

