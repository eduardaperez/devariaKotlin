package classes

class produto (val nome : String, val preco : Double) {
    fun exibirDadosProduto () : String {
        return "Produto nome: $nome e valor: R$ $preco"
    }
}