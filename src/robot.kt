import java.lang.Thread.*
import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*


class Robot(var roboName:String)
{
    var breatFast=mutableListOf("Sandwiches","Poha","Aloo Parathan","Macaroni","Fried Rice","Paneer Parathan")
    var lunchList=mutableListOf("Rajama Chawal","Choley Puri","Plane chapati with Dal","Curry and Rice","Masala Paneer")
    var shirts=mutableListOf("T-Shirt","Striped Shirt","White Shirt","Grey Shirt","Black T-Shirt")
    var pants=mutableListOf("Grey Jeans","Black Trousers","Black Jeans","Blue Jeans","Navy-blue Jeans")
    var currentTime = LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("H:m"))//used to store the current time in variable currentTime
    var currentDay = LocalDateTime.now().dayOfWeek.name
    fun ringAlarm(dayOff: String, alarmTime: String)
    {
        if ((currentDay.compareTo(dayOff, true) != 0) && currentTime.compareTo(alarmTime, true) == 0)
        {
            println("Good Morning this is your Personal Assistance ${roboName}. Please wake up or you are going to be late.")

        }

    }
    fun makeCoffee()
    {
        val sc=Scanner(System.`in`)
        println("How would you like your coffee sir? Black or with Milk")
        var coffee=sc.next()
        if (coffee.compareTo("black",true)==0)
        {
            println("how much tablespoons of sugar would you like")
            var sugar=sc.next()
            println("Hey your black coffee with $sugar tablespoon of sugar is ready, Enjoy")
        }
        else if ((coffee.compareTo("milk",true)==0)||(coffee.compareTo("with milk",true)==0))
        {
            println("how much tablespoons of sugar would you like")
            var sugar=sc.next()
            println("Sir your coffee with milk and $sugar tablespoon of sugar is ready, Enjoy")
        }
        else
        {
            println("Sorry sir but we don't have that kind of coffee yet")
        }

    }
    fun heatWater()
    {
        val sc=Scanner(System.`in`)
        var day="SATURDAY"
        if(day.compareTo(currentDay,true)==0)
        {
            println("Sir today you have instructed me not to heat water as you will not be taking a bath today")
            println("i would recommend that you should take a bath every day")
            println("are you planning to have a bath today if yes then type \"yes\" or if you want to change the day of not bathing to something else type \"change\" and \n \"no\" if you want to leave it as it is")
            val choice=sc.next()
            if (choice.compareTo("yes",true)==0)
            {
                println("Please enter the temperature of water")
                var temp=sc.next()
                println("The Water Heater is running, your bath water will be heated soon")
                println("while the water is heating can you tell me which clothes to iron")
                ironTheClothes()
                Thread.sleep(5000)
                println("Sir your water is heated up to $temp")
            }
            else if(choice.compareTo("change",true)==0)
            {
                println("Enter the day")
                day=sc.next()
                if(currentDay.compareTo(day,true)==0)
                {
                    println("then you will be skipping today's bath \n i would recommend applying some perfume")
                }
                else
                {
                    println("Please enter the temperature of water")
                    var temp=sc.next()
                    println("The Water Heater is running, your bath water will be heated soon")
                    println("while the water is heating can you tell me which clothes to iron")
                    ironTheClothes()
                    Thread.sleep(5000)
                    println("Sir your water is heated up to $temp")
                }

            }
            else if(choice.compareTo("no",true)==0)
            {
                println("Moving forward")
                ironTheClothes()
            }
        }
        else
        {
            println("Please enter the temperature of water")
            var temp=sc.next()
            println("The Water Heater is running, your bath water will be heated soon")
            println("while the water is heating can you tell me which clothes to iron")
            ironTheClothes()
            Thread.sleep(5000)
            println("Sir your water is heated up to $temp")
        }
    }

    fun packYourBag()
    {

        val day1 = Timetable("Monday","Physics","Chemistry","Mathematics","Computer Science","English","Social Studies")
        val day2 = Timetable("Tuesday","Chemistry","Physics","Mathematics","English","Physical Education","Computer Science")
        val day3 = Timetable("Wednesday","Free Period","Mathematics","English","Social Studies","Computer Science","Physics")
        val day4 = Timetable("Thursday","Physics","Chemistry","Free Period","Computer Science","Hindi","Social Studies")
        val day5 = Timetable("Friday","Computer Science","Mathematics","Physical Education","Free Period","English","Physics")
        println("Your bag is packed according to the following timetable")
        when(currentDay)
        {
            "MONDAY"    -> println(day1)
            "TUESDAY"   -> println(day2)
            "WEDNESDAY" -> println(day3)
            "THUSDAY"  -> println(day4)
            "FRIDAY"    -> println(day5)
            else -> println("$currentDay is free so you can relax or do your hobby")
        }
    }
    fun breakfastAndLunch()
    {
        println("Sir I have planned a menu for today")
        println("For Breakfast we have ${breatFast.random()}")
        println("And for Lunch we have ${lunchList.random()}")
        Thread.sleep(5000)
        println("Sir the breakfast is served. Enjoy your meal")
    }
    fun ironTheClothes()
    {
        val sc=Scanner(System.`in`)
        println("what among the following shirt would you like to where")
        println(shirts)
        val s=sc.next()
        println("what among the following pants would you like to where")
        println(pants)
        val p=sc.next()
        println("your clothes will be ready by the time you are finished taking a bath")
    }
}