def day = readnum "Enter a number between 1 and 12 : "

switch(day) {
    case 1:
        println "Day $day of the week is Monday"
        break
    case 2:
        println "Day $day of the week is Tuesday"
        break
    case 3:
        println "Day $day of the week is Wedensday"
        break
    case 4:
        println "Day $day of the week is Thursday"
        break
    case 5:
        println "Day $day of the week is Friday"
        break
    case 6:
        println "Day $day of the week is Saturday"
        break
    case 7:
        println "Day $day of the week is Sunday"
        break
        
    default:
        println "There are only 7 days in a week"
}