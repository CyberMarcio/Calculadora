fun somar(numero1: Double, numero2: Double): Double{
    val total = numero1 + numero2
    return total
}

fun subtrair(numero1:Double, numero2:Double): Double{
    val total = numero1 - numero2
    return total
}

fun multiplicar (numero1: Double, numero2: Double): Double{
    val total = numero1 * numero2
    return total
}

fun dividir(numero1: Double, numero2: Double): Double{
    var total: Double = 0.0
    try {
//        println("LINHA 19 - total antes: $total")
        total = numero1/numero2
//        println("LINHA 21 - total depois: $total")
    } catch (e: ArithmeticException){
        println("Não pode dividir número por zero.")
    }
    return total
}

fun main() {
    val valorQueRepete = 13
    val numero1 = 2.0
    val numero2 = 5.0

    println("valor que repete é: $valorQueRepete")
    val resultado3 = somar(numero1, numero2)
    println(resultado3 + valorQueRepete)
    val resultado = subtrair(numero1, numero2)
    println(resultado + valorQueRepete)
    val resultado1 = multiplicar(numero1, numero2)
    println(resultado1 + valorQueRepete)
    val resultado2 = dividir(numero1, numero2)
    println(resultado2 + valorQueRepete)
    println(resultado2)
}