def num1
def num2
def result
def operator

println "Calculating using two integers and an operator."
println()
num1 = readnum 'What is the first number? : '
operator = readln 'What do you want to do? You can +, -, *, / : '
num2 = readnum 'What is the second number? :'

if (operator.equals("+")) {
            num3 = num1 + num2
} else if (operator.equals("-")) {
    num3 = num1 - num2
} else if (operator.equals("*")) {
    num3 = num1 * num2
} else {
    num3 = num1 / num2
}
println()
println(num3)


