
class Player extends GroovyKids {
    public String name
    public String player
    
    def Player(String name, String player) {
        this.name = name
        this.player = player
    }
    
    def playRound(grid) {
        def correct = false
        def x
    
        while (!correct) {
            x = readnum "what square : "
            if (grid[x] == ' ') {
                correct = true
            } else {
                println "You need to select a free square"
            }
        }
        
        grid[x] = player
    }
}