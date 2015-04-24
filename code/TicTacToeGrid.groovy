
def grid = new Grid()

def x
for (number in 1..10){
    grid.show()

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

    if (grid.isSolved()) {
        grid.show()
        banner "You are the winner"
        break
    }
}
