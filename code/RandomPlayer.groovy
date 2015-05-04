class RandomPlayer extends Player {
    def RandomPlayer(String name, String player) {
        super(name,player)
    }
    
    def playRound(grid) {
        if (!grid.isSolved()) {
            grid.playRandomCell this.player
        }
        sleep(1000)
    }
}