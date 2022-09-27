# Δίνονται δύο λίστες ίσου μεγέθους i.
# Δημιουργήστε μια νέα λίστα πλειάδων όπου η πρώτη πλειάδα
# προκύπτει από το πρώτο στοιχείο της πρώτης λίστας και το τελευταίο της δεύτερης,
# η δεύτερη πλειάδα από το δεύτερο στοιχείο της πρώτης λίστας και το προτελευταίο της δεύτερης, κοκ.
# Προσπαθήστε και χωρίς τη χρήση της συνάρτησης zip.
aList = [5,8,2,3]
bList = [4,1,6,9]


def zipListReverse(aList,bList):
    reverseList=[]
    cList=[]

    for i in range(len(bList)-1,-1,-1):
        reverseList+=[bList[i]]

    for i in range(len(aList)):
        cList += [(aList[i],reverseList[i])]

    return cList
    
cList=zipListReverse(aList,bList)

print(cList)
