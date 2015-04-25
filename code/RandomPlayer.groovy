class RandomPlayer extends Player {
    def RandomPlayer(String name, String OxO) {
        super(name,OxO)
    }
    
    def playRound(grid) {
        if (!grid.isSolved()) {
            def random = new Random()
            def x = random.nextInt 10
            while(grid[x] != ' ')
                x = random.nextInt 10
            grid[x] = this.OxO
        }
        sleep(1000)
    }
}