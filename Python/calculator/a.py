# Παράδειγμα Αριθμομηχανής με γραφικό περιβάλλον

from tkinter import *
import math

root = Tk()

root.title("CALCULATOR")

root.resizable(0, 0)

firstframe=Frame(root)
firstframe.pack()

entry=Entry(firstframe, justify=RIGHT)
entry.grid(row=0, column=0, columnspan=6)

# Buttons  Συναρτήσεις  
def button1():
    entry.insert(END, "1")
    
def button2():
    entry.insert(END, "2")

def button3():
    entry.insert(END, "3")

def button4():
    entry.insert(END, "4")

def button5():
    entry.insert(END, "5")

def button6():
    entry.insert(END, "6")

def button7():
    entry.insert(END, "7")

def button8():
    entry.insert(END, "8")

def button9():
    entry.insert(END, "9")

def button0():
    entry.insert(END, "0")

def buttonplus():
    entry.insert(END, "+")
    
def buttonminus():
    entry.insert(END, "-")

def buttonepi():
    entry.insert(END, "*")

def buttondia():
    entry.insert(END, "/")

# Υπολογισμός αποτελέσματος.
def buttonsum():
    entry.get()
    try:
        result=eval(entry.get())
        entry.delete(0, END)
        entry.insert(END, result)
    except ZeroDivisionError:
        entry.delete(0, END)
        entry.insert(END, "ERROR")
        
    

def buttonc():
    entry.delete(0, END)

def buttonlp():
    entry.insert(END, "(")

def buttonrp():
    entry.insert(END, ")")

def buttont():
    entry.insert(END, ".")

def buttonr():
    entry.get()
    try:
        result=math.sqrt(float(entry.get()))
        entry.delete(0, END)
        entry.insert(END, result)
    except ValueError:
        entry.delete(0, END)
        entry.insert(END, "ERROR")
        
def buttonlog():
    entry.get()
    try:
        result=math.log(float(entry.get()))
        entry.delete(0, END)
        entry.insert(END, result)
    except ValueError:
        entry.delete(0, END)
        entry.insert(END, "ERROR")
        
def buttonlog10():
    entry.get()
    try:
        result=math.log10(float(entry.get()))
        entry.delete(0, END)
        entry.insert(END, result)
    except ValueError:
        entry.delete(0, END)
        entry.insert(END, "ERROR")

def buttonp():
    entry.insert(END, math.pi)

def button100():
    entry.get()
    result=eval(entry.get())/100
    entry.delete(0, END)
    entry.insert(END, result)
    
# Τοποθέτηση κουμπιών
button1= Button(firstframe, text="1", command=button1,padx=13 )
button1.grid(row=3, column=0)

button2= Button(firstframe, text="2", command=button2, padx=13)
button2.grid(row=3, column=1)

button3= Button(firstframe, text="3", command=button3, padx=13)
button3.grid(row=3, column=2)

button4= Button(firstframe, text="4", command=button4, padx=13)
button4.grid(row=2, column=0)

button5= Button(firstframe, text="5", command=button5, padx=13)
button5.grid(row=2, column=1)

button6= Button(firstframe, text="6", command=button6, padx=13)
button6.grid(row=2, column=2)

button7= Button(firstframe, text="7", command=button7,padx=13 )
button7.grid(row=1, column=0)

button8= Button(firstframe, text="8", command=button8,padx=13 )
button8.grid(row=1, column=1)

button9= Button(firstframe, text="9", command=button9,padx=13 )
button9.grid(row=1, column=2)

button0= Button(firstframe, text="0", command=button0, padx=13)
button0.grid(row=4, column=1)

buttonplus= Button(firstframe, text="+", command=buttonplus, padx=14)
buttonplus.grid(row=4, column=3)

buttonminus=Button(firstframe, text="-", command=buttonminus, padx=15)
buttonminus.grid(row=3, column=3)

buttonepi=Button(firstframe, text="*", command=buttonepi, padx=15)
buttonepi.grid(row=2, column=3)

buttondia=Button(firstframe, text="/", command=buttondia, padx=16)
buttondia.grid(row=1, column=3)

buttonsum= Button(firstframe, text="=", command=buttonsum, padx=13)
buttonsum.grid(row=4, column=2)

buttonc= Button(firstframe, text="D", command=buttonc, padx=15)
buttonc.grid(row=1, column=4)

buttonlp=Button(firstframe, text="(", command=buttonlp, padx=17)
buttonlp.grid(row=2, column=4)

buttonrp=Button(firstframe, text=")", command=buttonrp, padx=17)
buttonrp.grid(row=3, column=4)

buttont=Button(firstframe, text=".", command=buttont, padx=15)
buttont.grid(row=4, column=0)

buttonr=Button(firstframe, text="√", command=buttonr, padx=25)
buttonr.grid(row=3, column=5)

buttonlog=Button(firstframe, text="logx", command=buttonlog, padx=17)
buttonlog.grid(row=1, column=5)

buttonlog10=Button(firstframe, text="log10x", command=buttonlog10, padx=11)
buttonlog10.grid(row=2, column=5)

buttonp=Button(firstframe, text="π", command=buttonp, padx=15)
buttonp.grid(row=4, column=4)

button100=Button(firstframe, text="%", command=button100, padx=23)
button100.grid(row=4, column=5)


root.mainloop()
