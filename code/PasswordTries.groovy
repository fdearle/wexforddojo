def name
def secret = 'opensesame'
def password
def guessed = false

name = readln 'What is your name : '
 
for (number in 1..3) {
    password = readln 'Tell me a secret : '
    if (secret == password) {
        guessed = true
        break
    }
}
 
if (guessed) {
    banner "You  guessed  it  right !"
} else {
    banner "DOH! Failed too many times"
}

