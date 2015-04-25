
class Player extends GroovyKids {
    public String name
    public String OxO
    
    def Player(String name, String OxO) {
        this.name = name
        this.OxO = OxO
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
        
        grid[x] = OxO
    }
}