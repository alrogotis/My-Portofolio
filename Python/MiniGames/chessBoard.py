from tkinter import *

root = Tk()
root.title('CHESS')
canvas = Canvas(root, width=700, height=700)
canvas.pack()
canvas.create_line(60, 60, 620, 60)
canvas.create_line(620, 620, 60, 620)
canvas.create_line(60, 60, 60, 620)
canvas.create_line(620, 620, 620, 60)
canvas.create_rectangle(60, 60, 130, 130, fill = 'white')
canvas.create_rectangle(130, 130, 200, 200, fill = 'white')
canvas.create_rectangle(200, 200, 270, 270, fill = 'white')
canvas.create_rectangle(270, 270, 340, 340, fill = 'white')
canvas.create_rectangle(340, 340, 410, 410, fill = 'white')
canvas.create_rectangle(410, 410, 480, 480, fill = 'white')
canvas.create_rectangle(480, 480, 550, 550, fill = 'white')
canvas.create_rectangle(550, 550, 620, 620, fill = 'white')
canvas.create_rectangle(60, 130, 130, 200, fill = 'black')
canvas.create_rectangle(130, 200, 200, 270, fill = 'black')
canvas.create_rectangle(200, 270, 270, 340, fill = 'black')
canvas.create_rectangle(270, 340, 340, 410, fill = 'black')
canvas.create_rectangle(340, 410, 410, 480, fill = 'black')
canvas.create_rectangle(410, 480, 480, 550, fill = 'black')
canvas.create_rectangle(480, 550, 550, 620, fill = 'black')
canvas.create_rectangle(60, 200, 130, 270, fill = 'white')
canvas.create_rectangle(130, 270, 200, 340, fill = 'white')
canvas.create_rectangle(200, 340, 270, 410, fill = 'white')
canvas.create_rectangle(270, 410, 340, 480, fill = 'white')
canvas.create_rectangle(340, 480, 410, 550, fill = 'white')
canvas.create_rectangle(410, 550, 480, 620, fill = 'white')
canvas.create_rectangle(60, 270, 130, 340, fill = 'black')
canvas.create_rectangle(130, 340, 200, 410, fill = 'black')
canvas.create_rectangle(200, 410, 270, 480, fill = 'black')
canvas.create_rectangle(270, 480, 340, 550, fill = 'black')
canvas.create_rectangle(340, 550, 410, 620, fill = 'black')
canvas.create_rectangle(60, 340, 130, 410, fill = 'white')
canvas.create_rectangle(130, 410, 200, 480, fill = 'white')
canvas.create_rectangle(200, 480, 270, 550, fill = 'white')
canvas.create_rectangle(270, 550, 340, 620, fill = 'white')
canvas.create_rectangle(60, 410, 130, 480, fill = 'black')
canvas.create_rectangle(130, 480, 200, 550, fill = 'black')
canvas.create_rectangle(200, 550, 270, 620, fill = 'black')
canvas.create_rectangle(60, 480, 130, 550, fill = 'white')
canvas.create_rectangle(130, 550, 200, 620, fill = 'white')
canvas.create_rectangle(60, 550, 130, 620, fill = 'black')
canvas.create_rectangle(130, 60, 200, 130, fill = 'black')
canvas.create_rectangle(200, 130, 270, 200, fill = 'black')
canvas.create_rectangle(270, 200, 340, 270, fill = 'black')
canvas.create_rectangle(340, 270, 410, 340, fill = 'black')
canvas.create_rectangle(410, 340, 480, 410, fill = 'black')
canvas.create_rectangle(480, 410, 550, 480, fill = 'black')
canvas.create_rectangle(550, 480, 620, 550, fill = 'black')
canvas.create_rectangle(200, 60, 270, 130, fill = 'white')
canvas.create_rectangle(270, 130, 340, 200, fill = 'white')
canvas.create_rectangle(340, 200, 410, 270, fill = 'white')
canvas.create_rectangle(410, 270, 480, 340, fill = 'white')
canvas.create_rectangle(480, 340, 550, 410, fill = 'white')
canvas.create_rectangle(550, 410, 620, 480, fill = 'white')
canvas.create_rectangle(270, 60, 340, 130, fill = 'black')
canvas.create_rectangle(340, 130, 410, 200, fill = 'black')
canvas.create_rectangle(410, 200, 480, 270, fill = 'black')
canvas.create_rectangle(480, 270, 550, 340, fill = 'black')
canvas.create_rectangle(550, 340, 620, 410, fill = 'black')
canvas.create_rectangle(340, 60, 410, 130, fill = 'white')
canvas.create_rectangle(410, 130, 480, 200, fill = 'white')
canvas.create_rectangle(480, 200, 550, 270, fill = 'white')
canvas.create_rectangle(550, 270, 620, 340, fill = 'white')
canvas.create_rectangle(410, 60, 480, 130, fill = 'black')
canvas.create_rectangle(480, 130, 550, 200, fill = 'black')
canvas.create_rectangle(550, 200, 620, 270, fill = 'black')
canvas.create_rectangle(480, 60, 550, 130, fill = 'white')
canvas.create_rectangle(550, 130, 620, 200, fill = 'white')
canvas.create_rectangle(550, 60, 620, 130, fill = 'black')

root.mainloop()