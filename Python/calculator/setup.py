import cx_Freeze

base=None

executables= [cx_Freeze.Executable("a.py", base=base)]

cx_Freeze.setup(
    name= "MY CALCULATOR",
    options= {"build.exe": {"packages":["tkinter","math"]}},
    version= "0.01",
    description= "a simple calculator application",
    executables= executables
    )
    
