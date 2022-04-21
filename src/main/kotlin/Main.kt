fun somar(numero1: Int, numero2: Int): Int{
    val total = numero1 + numero2
    return total
}

fun subtrair(numero1:Int, numero2:Int): Int{
    val total = numero1 - numero2
    return total
}

fun multiplicar (numero1: Int, numero2: Int): Int{
    val total = numero1 * numero2
    return total
}

fun dividir(numero1: Int, numero2: Int): Int{
    val total = numero1/numero2
    return total
}

fun main() {
    val valorQueRepete = 13
    val numero1 = 0
    val numero2 = 2

    println("valor que repete é: $valorQueRepete")
    val resultado3 = somar(numero1, numero2)
    println(resultado3 + valorQueRepete)
    val resultado = subtrair(numero1, numero2)
    println(resultado + valorQueRepete)
    val resultado1 = multiplicar(numero1, numero2)
    println(resultado1 + valorQueRepete)
    val resultado2 = dividir(numero1, numero2)
    println(resultado2 + valorQueRepete)
}