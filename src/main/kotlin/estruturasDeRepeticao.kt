fun main(argumentos : Array<String>) {

    // for subindo
    for (indice in argumentos.indices){
        println("Percorrendo os argumentos. Posição: ${indice+1}  Valor: ${argumentos[indice]}")
    }
    // for descendo
    for (indiceDecrescente in argumentos.size-1 downTo 0) {
        println("Percorrendo os valoes em decrescência. Posição: ${indiceDecrescente+1} Valor: ${argumentos[indiceDecrescente]}")
    }
    //for each
    for (argumento in argumentos) {
        println("Percorrendo os argumentos com foreach. Valor: $argumento")
    }

    //while
    var contadorDeArgumentosLidos = 0
    while (contadorDeArgumentosLidos < argumentos.size){
        println("Percorrendo os argumentos com while. Argumentos lidos: ${++contadorDeArgumentosLidos} Valor lido: ${argumentos[contadorDeArgumentosLidos-1]}")
    }

    //do while
    var contadorLoopsEfetuados = 0
    do {
        println("Percorrendo os argumentos com dowhile. Total de Loops: ${contadorLoopsEfetuados+1} Valor lido: ${argumentos[contadorLoopsEfetuados]}")
        contadorLoopsEfetuados++
    }while (contadorLoopsEfetuados < argumentos.size)
}