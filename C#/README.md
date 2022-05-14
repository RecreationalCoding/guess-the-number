# Guess The Number Game in C#
## Youtube Video
[![Youtube Video](https://img.youtube.com/vi/-_AJEyJNEN8/0.jpg)](https://www.youtube.com/watch?v=-_AJEyJNEN8)

## C# version
```console
C# 10.0
```

Content of the `GuessTheNumber.cs` file:
```csharp
var randomNumber = new Random().NextInt64(1, 101);
var attempts = 0;

Console.WriteLine("I'm thinking of a number between 1 and 100.");
Console.Write("Take a guess: ");

while (true)
{
    var guess = int.Parse(Console.ReadLine());
    attempts++;

    if (guess == randomNumber)
    {
        Console.WriteLine($"You guessed it! The number was {randomNumber}.");
        Console.WriteLine($"You guessed it in {attempts} attempts.");
        break;
    }

    if (guess < randomNumber)
    {
        Console.WriteLine("Your guess is too low.");
    }
    else
    {
        Console.WriteLine("Your guess is too high.");
    }

    Console.Write("Take a guess again: ");
}
```
