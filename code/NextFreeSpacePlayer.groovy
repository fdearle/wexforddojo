class NextFreeSpacePlayer extends Player {
    def NextFreeSpacePlayer(String name, String OxO) {
        super(name,OxO)
    }
    
    def playRound(grid) {
        if (!grid.isSolved()) {
            def x = 0
            while(grid[x] != ' ' && x < 10)
                x = x + 1
            grid[x] = this.OxO
        }
        sleep(1000)
    }
}