def names = ["Tony","Fergal","Declan","Carol"]

def myName
 

println names
println names[0]
println names[1]
println names[2]
println names[3]

println()
myName = readln "What is your name? :"
names.add(2, myName)
println()

println names
println()
names.remove(1)
println names
