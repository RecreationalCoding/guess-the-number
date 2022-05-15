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
