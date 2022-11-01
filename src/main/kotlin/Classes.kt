import classes.produto

fun main(argumentos : Array<String>) {
    if (argumentos.isEmpty()){
        println("Favor, informar a lista de produtos que deseja comprar")
        return
    }

    val itensDisponiveis = arrayOf(
        produto(nome = "Arroz", preco = 35.10),
        produto(nome = "Azeite", preco = 16.90),
        produto(nome = "Carne", preco = 59.89),
        produto(nome = "Açucar", preco = 2.40)
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any {
                argumento -> argumento.equals(produto.nome, ignoreCase = true)
            }
    }

    for (itemSelecionadoDisponivel in itensSelecionadosDisponiveis) {
        println(itemSelecionadoDisponivel.exibirDadosProduto())
    }

    val argumentosSelecionadosNaoDisponiveis = argumentos.filter {
            argumento -> !itensDisponiveis.any {
                produto -> produto.nome.equals(argumento, ignoreCase = true)
            }
    }

    argumentosSelecionadosNaoDisponiveis.forEach {
        argumento -> println("Este produto nós não temos: $argumento")
    }

    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira este produto disponível: ${it.exibirDadosProduto()}") }
}