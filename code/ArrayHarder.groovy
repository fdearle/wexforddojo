def names = ["Tony","Fergal","Declan"]
def response = ["cool dude","developer dude","network dude"]
def myName
def index

myName = readln "What is your name? :"

//gets the index number of your name if it is in the List
index = names.indexOf(myName)
 
//Tests if your name is in the List
if(myName in names){
    
    //If your name is in the list it will run this code block 
    println "Hello $myName ," + "you are a " + response[index]
}
//Runs this code block if your name isn't in the List
else{
    println "Sorry, I don't know you."
}
