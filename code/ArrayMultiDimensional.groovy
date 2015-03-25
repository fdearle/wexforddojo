def people = [
        [name: "Tony",description: "cool guy"],
        [name:"Fergal",description:"developer dude"],
        [name:"Declan",description:"network guy"]
    ]
def myName


myName = readln "What is your name? :"

for(person in people){
    
        if(myName == person.name){
    
            println "Hello "+ person.name  + " you are a " + person.description    
  
        }
        
}






