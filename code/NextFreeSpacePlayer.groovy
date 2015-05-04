class NextFreeSpacePlayer extends Player {
    def NextFreeSpacePlayer(String name, String player) {
        super(name,player)
    }
    
    def playRound(grid) {
        if (!grid.isSolved()) {
            grid.playNextFreeCell this.player
        }
        sleep(1000)
    }
}