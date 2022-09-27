# Το πρόγραμμα τυπώνει τον πίνακα της προπαίδειας (1 έως 10).

def multiplicationTable():
    num=1

    for i in range(1,11):
        for i in range(1,11):
            print(str(num)+" * "+str(i)+" = "+str(num*i))
        num=num+1

multiplicationTable()


    
