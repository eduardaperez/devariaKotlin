fun main(argumentos : Array<String>) {

    if (argumentos.isEmpty()) {
        println("Favor informar sua lista de produtos para verificar disponibilidade: ")
        return
    }

    val produtosDisponiveis = arrayOf(
        "Pão", "Bolacha", "Queijo", "Arroz", "Feijão", "Ovo", "Frango",
        "Leite", "Óleo"
    )

    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado ->
        produtosDisponiveis.contains(produtoRequisitado)
    }

    for (produtoRequisitadoDisponivel in produtosRequisitadosDisponiveis) {
        println("Este produto nós temos: $produtoRequisitadoDisponivel")
    }

    val produtosRequisitadosNaoDisponiveis = argumentos.filter { produtoRequisitado ->
        !produtosDisponiveis.contains(produtoRequisitado)
    }

    produtosRequisitadosNaoDisponiveis.forEach { produtoNaoDisponivel ->
        println("Este produto nós não temos, infelizmente: $produtoNaoDisponivel")
    }

    produtosDisponiveis.sortBy { produto -> produto }
    produtosDisponiveis.forEach { produto -> println("Confira este produto disponível: $produto") }
}