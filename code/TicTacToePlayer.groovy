
def grid = new Grid()
def playerX = new Player('Console Player 1', 'X')
def playerO = new Player('Random Player 2', 'O')

for (number in 1..10){
    grid.show()

    if (number == 10)
        break


    if (number % 2)
        playerX.playRound(grid)
    else
        playerO.playRound(grid)

    if (grid.isSolved()) {
        grid.show()
        banner "You are the winner"
        break
    }
}
