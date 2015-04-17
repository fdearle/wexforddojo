
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

    if (isSolved(grid, rows)) {
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

def rows = [
        [0,1,2],
        [3,4,5],
        [6,7,8],
        [0,3,6],
        [1,4,7],
        [2,5,8],
        [0,4,8],
        [6,4,2]
]

boolean isSolved(grid, rows) {
    // If the row is not a space the its either X or O
    // If the first cell is the same as second and
    // If the second cell is the same as third then its solved
    rows.find { cells ->
        grid[cells[0]] != ' ' &&
        grid[cells[0]] == grid[cells[1]] &&
        grid[cells[1]] == grid[cells[2]]
    }
}



