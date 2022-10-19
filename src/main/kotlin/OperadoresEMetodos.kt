import java.math.BigDecimal

fun calculaOperacao(numeroUm : BigDecimal, operador : String, numeroDois : BigDecimal) : BigDecimal {
    when(operador){
        "+" -> return numeroUm + numeroDois
        "-" -> return numeroUm - numeroDois
        "*" -> return numeroUm * numeroDois
        "/" -> return numeroUm / numeroDois
        "%" -> return numeroUm % numeroDois
        else -> return BigDecimal.ZERO
    }
}

fun main() {

    println("Digite o primeiro número válido: ")
    val numeroUm = readln()?.toBigDecimalOrNull()

    if (numeroUm == null) {
        println("Número informado não é válido")
        return
    }

    println("Digite um operador válido (+, -, *, / ou %): ")
    val  operador = readln()

    if (operador.isBlank() || operador.isEmpty() ||
        ((operador != null) && (operador != "+") && (operador != "-") && (operador != "*") && (operador != "/") && (operador != "%"))
    ) {
        println("Operador informado não é válido")
        return
    }

    println("Digite o segundo número válido: ")
    val  numeroDois = readln()?.toBigDecimalOrNull()

    if (numeroDois == null) {
        println("Número informado não é válido")
        return
    }

    val resultado = calculaOperacao(numeroUm, operador, numeroDois)
    println("O resultado da sua operação foi: $resultado")
}