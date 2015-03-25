banner "1 .. 10"
for (number in 1..10) {
    println number
}

banner "1 .. 5"
for (number in 1..10) {
    println number
    
    if (number == 5)
        break
}

banner "Fruits"
for (fruit in ["Apple", "Orange", "Banana"]) {
    println fruit
}