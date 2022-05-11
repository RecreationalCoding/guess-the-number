# Guess The Number Game in Java
## Youtube Video
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/-E4_td3Iqa0/0.jpg)](https://www.youtube.com/watch?v=-E4_td3Iqa0)

## python version
```console
foo@bar:~$ python --version
Python 3.10.4
```

Content of the `guess_the_number.py` file:
```python
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
```
