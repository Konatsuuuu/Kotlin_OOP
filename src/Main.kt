//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    val mouse0:Mouse = Mouse("Jerry")
    moveAndMakeASound(mouse0)
    mouse0.StealCheese(5)
    println(mouse0.getCheeseAmount())
    mouse0.EatCheese()
    println(mouse0.getCheeseAmount())

}

fun moveAndMakeASound(animal:Animal){
    animal.move("forward")
    animal.makeASound()
}