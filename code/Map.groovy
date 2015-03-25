def day = readnum "Enter a number between 1 and 7 : "

def daysOfTheWeek = [1: "Monday", 2: "Tuesday", 3: "Wedensday", 4: "Thursday", 5: "Friday", 6: "Saturday", 7: "Sunday"]

def picked = daysOfTheWeek[day]
println "Day $day of the week is $picked"

