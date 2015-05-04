
def grid = new Grid()
def playerX = new NextFreeSpacePlayer('Console Player 1', 'X')
def playerO = new RandomBlockingPlayer('Random Player 2', 'O')

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
        banner  "${number % 2?'X':'O'} is the winner "
        break
    }
}

if (!grid.solved)
    banner "Nobody Wins"