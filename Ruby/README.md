# Guess The Number Game in Ruby
## Youtube Video
[![Youtube Video](https://img.youtube.com/vi/4TkqnZEcdq8/0.jpg)](https://www.youtube.com/watch?v=4TkqnZEcdq8)

## ruby version
```console
foo@bar:~$ ruby --version
ruby 3.1.2p20 (2022-04-12 revision 4491bb740a) [x64-mingw-ucrt]
```

Content of the `guess_the_number.rb` file:
```ruby
random_number = rand(100) + 1
attempts = 0
puts "I'm thinking of a number between 1 and 100."
print 'Take a guess: '
while true
  guess = gets.to_i
  attempts += 1
  if guess == random_number
    puts "You guessed it! The number was #{random_number.to_s}."
    puts "You guess it in #{attempts.to_s} attempts."
    break
  elsif guess < random_number
    puts "Your guess is too low."
  else
    puts "Your guess is too high."
  end
  print "Take a guess again: "
end
```
