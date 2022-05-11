import random

random_number = random.randint(1, 100)
guesses = 0
print("I'm thinking of a number between 1 and 100.")
guess = int(input("Take a guess: "))
while True:
    guesses += 1
    if guess == random_number:
        print("You guessed it! The number was", random_number)
        print("You guessed it in", guesses, "attempts.")
        break
    elif guess < random_number:
        print("Your guess is too low.")
    else:
        print("Your guess is too high.")
    guess = int(input("Take a guess again: "))