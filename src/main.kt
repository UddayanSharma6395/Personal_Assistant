fun main()
{
    val robo=Robot("Jarvis")
    robo.ringAlarm("Monday","10:39")
    robo.makeCoffee()
    println()
    Thread.sleep(2000)
    println()
    robo.heatWater()
    println()
    robo.breakfastAndLunch()
    println()
    robo.packYourBag()

}