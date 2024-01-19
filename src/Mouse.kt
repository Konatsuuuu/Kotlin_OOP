class Mouse (_name:String="The mouse"):Animal(_name)
{
    private var CheeseAmount: Int = 0

    override fun makeASound()
    {
        squeak()
    }

    private fun squeak()
    {
        println("$animalName said squeak!")
    }

    fun StealCheese(amount: Int)
    {
        CheeseAmount += amount
    }

    fun EatCheese()
    {
        CheeseAmount--
    }

    fun getCheeseAmount(): Int
    {
        return CheeseAmount
    }
}