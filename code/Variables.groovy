// Use def for dynamic type
def aString = "This is a string : "
def aName = "Zebedee" 
def anInteger = 1
def aFloat = 1.0F
def aBoolean = false


// Or use the exact type
String myString = "This is my String : "
String myName = "Tony"
int myInteger = 2
float myFloat = 2.0F
boolean myBoolean = true

println aString + aName
println myString + myName
println()
println "This is an integer : " + anInteger
println "My interger is : "+myInteger
println "This is anInteger plus myInteger : "+ (anInteger + myInteger)
println()
println "This is a Float : " + aFloat
println "My Float is : "+myFloat
println "This is aFloat plus myFloat : "+ (aFloat + myFloat)
println()
println "This is aBoolean : "+aBoolean
println "My boolean is : " +myBoolean
println "Are myBoolean and aBoolean the same? : "+(aBoolean == myBoolean)



