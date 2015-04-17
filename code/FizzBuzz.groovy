for ( number in 1..100) {
    if (number % 3 == 0)
        println "Fizz"
    println number
}






























//(1..100).each { println (it % 3 ? (it % 5 ? it : "Buzz") : (it % 5 ? "Fizz" : "FizzBuzz")) }






//for ( number in 1..100) {
//	if (number % 3 && number % 5)
//		print number
//	if (number % 3 == 0)
//		print "Fizz"
//	if (number % 5 == 0)
//		print "Buzz"
//	println()
//}