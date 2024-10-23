import scala.io.StdIn

@main 
def run(): Unit =
    println("Informe a sequencia de parenteses:")
    val sequence = StdIn.readLine();

    if wellFormedParenthesesCounter(sequence) then
        println("A expressao esta bem formada.")
    else
        println("A expressao nao esta bem formada.")