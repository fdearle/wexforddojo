def grid = new Grid()

grid[0] = 'X'
grid[1] = 'X'
grid[2] = 'O'

// Should not be solved
assert grid.isSolved() == false

grid.clear()
grid[0] = 'X'
grid[1] = 'X'
grid[2] = 'X'

assert grid.isSolved() == true

grid.clear()
grid[0] = 'X'
grid[1] = 'X'
grid[2] = ' '

assert grid.canWin('X') 
assert grid.canWin('O') == false

grid.clear()
grid[0] = 'X'
grid[1] = 'O'
grid[2] = 'X'
grid[3] = 'X'

assert grid.canWin('X')