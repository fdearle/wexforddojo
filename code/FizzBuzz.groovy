for ( number in 1..100) {
    if (number % 3 == 0)
        println "Fizz"
    println number
}

(1..100).each { println (it % 3 ? (it % 5 ? it : "Buzz") : (it % 5 ? "Fizz" : "FizzBuzz")) }

