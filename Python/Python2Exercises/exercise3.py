# Δίνονται δύο λίστες ίσου μεγέθους i.
# Δημιουργήστε μια νέα λίστα πλειάδων δύο θέσεων, μεγέθους i*i,
# όπου κάθε στοιχείο της πρώτης λίστας (πρώτο στοιχείο της πλειάδας) "ζευγαρώνει"
# με κάθε στοιχείο της δεύτερης λίστας (δεύτερο στοιχείο της πλειάδας).
# Π.χ. αν list1=[1,2] και list2=[3,4], τότε list3=[(1,3),(1,4),(2,3),(2,4)].
list1=[1,2]
list2=[3,4]



def zipLists(list1,list2):
    list3=[]
    for i in range(len(list1)):
        for j in range(len(list2)):
            list3 += [(list1[i],list2[j])]
    
    return list3

list3=zipLists(list1,list2)

print(list3)

    

