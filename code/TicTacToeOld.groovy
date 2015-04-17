def grid = [
' ',' ',' ',
' ',' ',' ',
' ',' ',' '
]

def SP = ' '
def x
for (number in 1..10){
println '    0   1   2'
println '  +-----------+  +-----------+'
println "0 | ${grid[0]} | ${grid[1]} | ${grid[2]} |  | 0 | 1 | 2 |"
println "  |---+---+---|  |---+---+---|"
println "1 | ${grid[3]} | ${grid[4]} | ${grid[5]} |  | 3 | 4 | 5 |"
println "  |---+---+---|  |---+---+---|"
println "2 | ${grid[6]} | ${grid[7]} | ${grid[8]} |  | 6 | 7 | 8 |"
println '  +-----------+  +-----------+'

if (number == 10)
    break

def correct = false

while (!correct) {
    x = readnum "what square : "
    if (grid[x] == ' ') {
        correct = true
    } else {
        println "You need to select a free square"
    }
}

if (number % 2)
    grid [x] = 'X'
else
    grid [x] = 'O'
}