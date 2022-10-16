fun main() {

    println("Favor, informar o nome do convidado: ")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome informado não é válido")
        return
    }

    println("Favor informar a idade do convidado: ")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0){
        println("A idade informada não é válida")
        return
    }

    var estaConvidado = false
    when(nome.lowercase()){
        "eduarda" -> estaConvidado = true
        "julio" -> estaConvidado = true
        "maria" -> estaConvidado = true
        "bianca" -> estaConvidado = true
        "bruna" -> estaConvidado = true
        else -> estaConvidado = false
    }

    if(estaConvidado && idade >= 18) {
            println("Bem vindo à festa!")
    }else if (!estaConvidado){
            println("Infelizmente seu nome não consta na lista de convidados")
    }else {
            println("Festa autorizada para maiores de 18 anos. Volte em alguns anos")
    }
}