class RandomBlockingPlayer extends Player {
    def RandomBlockingPlayer(String name, String player) {
        super(name,player)
    }
    
    def playRound(grid) {
        if (!grid.isSolved()) {
            if (grid.canWin(this.player))
                grid.playWin this.player
            else if (grid.canBlock(this.player))
                grid.playBlock this.player
            else
                grid.playRandomCell this.player
        }
        sleep(1000)
    }
}