# Το πρόγραμμα ζητά δύο αριθμούς και κάνει όλες τις μεταξύ τους πράξεις (a+b, a-b, a*b, a/b, a//b, a%b).

def operations(numa,numb):
    print(numa + numb)
    print(numa - numb)
    print(numa * numb)
    print(numa / numb)
    print(numa // numb)
    print(numa % numb)

numa=float(input("Give me one number "))
numb=float(input("Give me an another number "))

operations(numa,numb)
