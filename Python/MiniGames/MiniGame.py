from random import random
import re

secret = int(random()*100)
tries = 10

def feedback(guess):
    distance = abs(secret-guess) 
    if distance < 2:
        return  "burning"
    elif distance < 3:
        return  "Billing"
    elif distance < 5:
        return "very hot"
    elif distance < 10:
        return "hot"
    elif distance < 20:
        return "lukewarm"
    elif distance < 30:
        return "cold"
    else:
        return "freezing"

print("welcome to the Number guessing game")
print("I thought of a number, can you guess it?")

guessed = False
game_over = False

while not guessed and not game_over:
    guess = int(input("what is your guess? "))
    guessed = guess == secret
    if not guessed:
        tries -= 1
        game_over = tries == 0
        if game_over:
            print(f"Game over :-( My secret was {secret}")
        else:
            print(f"Your guess is {feedback(guess)}, try again, {tries} tries left")
    else:
        print("Right: Congratulations!")

