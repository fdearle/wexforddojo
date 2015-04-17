def grid = [
' ',' ',' ',
' ',' ',' ',
' ',' ',' '
]

def x
for (number in 1..10){
    showGrid(grid)

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

    if (isSolved(grid)) {
        showGrid(grid)
        banner "You are the winner"
        break
    }
}

def showGrid(grid) {
    println '    0   1   2'
    println '  +-----------+  +-----------+'
    println "0 | ${grid[0]} | ${grid[1]} | ${grid[2]} |  | 0 | 1 | 2 |"
    println "  |---+---+---|  |---+---+---|"
    println "1 | ${grid[3]} | ${grid[4]} | ${grid[5]} |  | 3 | 4 | 5 |"
    println "  |---+---+---|  |---+---+---|"
    println "2 | ${grid[6]} | ${grid[7]} | ${grid[8]} |  | 6 | 7 | 8 |"
    println '  +-----------+  +-----------+'
}

boolean isSolved(grid) {
    (grid[0] == 'X' && grid[0] == grid[1] && grid[1] == grid[2]) ||
    (grid[3] == 'X' && grid[3] == grid[4] && grid[1] == grid[5]) ||
    (grid[6] == 'X' && grid[6] == grid[7] && grid[1] == grid[8]) ||
    (grid[0] == 'X' && grid[0] == grid[3] && grid[1] == grid[6]) ||
    (grid[1] == 'X' && grid[1] == grid[4] && grid[1] == grid[7]) ||
    (grid[2] == 'X' && grid[2] == grid[5] && grid[1] == grid[8]) ||
    (grid[0] == 'X' && grid[0] == grid[4] && grid[1] == grid[8]) ||
    (grid[6] == 'X' && grid[6] == grid[4] && grid[1] == grid[2]) ||
    (grid[0] == 'O' && grid[0] == grid[1] && grid[1] == grid[2]) ||
    (grid[3] == 'O' && grid[3] == grid[4] && grid[1] == grid[5]) ||
    (grid[6] == 'O' && grid[6] == grid[7] && grid[1] == grid[8]) ||
    (grid[0] == 'O' && grid[0] == grid[3] && grid[1] == grid[6]) ||
    (grid[1] == 'O' && grid[1] == grid[4] && grid[1] == grid[7]) ||
    (grid[2] == 'O' && grid[2] == grid[5] && grid[1] == grid[8]) ||
    (grid[0] == 'O' && grid[0] == grid[4] && grid[1] == grid[8]) ||
    (grid[6] == 'O' && grid[6] == grid[4] && grid[1] == grid[2])
}
