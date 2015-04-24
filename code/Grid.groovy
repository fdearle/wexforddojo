class Grid {
    @Delegate List grid = [
    ' ',' ',' ',
    ' ',' ',' ',
    ' ',' ',' '
    ]
    def rows = [
        [0,1,2],
        [3,4,5],
        [6,7,8],
        [0,3,6],
        [1,4,7],
        [2,5,8],
        [0,4,8],
        [6,4,2]
    ]
    
    def show() {
        println '    0   1   2'
        println '  +-----------+  +-----------+'
        println "0 | ${grid[0]} | ${grid[1]} | ${grid[2]} |  | 0 | 1 | 2 |"
        println "  |---+---+---|  |---+---+---|"
        println "1 | ${grid[3]} | ${grid[4]} | ${grid[5]} |  | 3 | 4 | 5 |"
        println "  |---+---+---|  |---+---+---|"
        println "2 | ${grid[6]} | ${grid[7]} | ${grid[8]} |  | 6 | 7 | 8 |"
        println '  +-----------+  +-----------+'
    }
    
    void clear() {
        grid = [
        ' ',' ',' ',
        ' ',' ',' ',
        ' ',' ',' '
        ]        
    }
    
    boolean isSolved() {
        // If the row is not a space the its either X or O
        // If the first cell is the same as second and
        // If the second cell is the same as third then its solved
        rows.find { cells ->
            grid[cells[0]] != ' ' &&
            grid[cells[0]] == grid[cells[1]] &&
            grid[cells[1]] == grid[cells[2]]
        }
    }
    
    boolean canWin(player) {
        if (grid[0] == player && grid[1] == player && grid[2] == ' ')
            return true
        else
            return false
    }
    
    boolean canBlock(player) {
        false
    }
    
    boolean canTakeCorner(player) {
        false
    }
    
    boolean canTakeCenter(player) {
        false
    }

}