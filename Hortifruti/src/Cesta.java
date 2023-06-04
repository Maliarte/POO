import java.util.ArrayList;
import java.util.List;
/*
class Cesta {
    private static final int MAX_PRODUTOS = 12;
    private List<Produto> produtos;

    public Cesta() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produtos.size() >= MAX_PRODUTOS) {
            System.out.println("A cesta está cheia. Não é possível adicionar mais produtos.");
        } else {
            produtos.add(produto);
            System.out.println("Produto adicionado à cesta.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void listarCesta() {
        if (produtos.isEmpty()) {
            System.out.println("A cesta está vazia.");
        } else {
            System.out.println("Conteúdo da cesta:");
            for (Produto produto : produtos) {
                System.out.println("Tipo: " + produto.getClass().getSimpleName());
                System.out.println("Preço unitário: R$" + produto.getPreco());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println();
            }
            System.out.println("Valor total da cesta: R$" + calcularTotal());
        }
    }

    public void limparCesta() {
        produtos.clear();
        System.out.println("A cesta foi limpa.");
    }
}
*/
class Cesta {
    private List<Produto> produtos; // Declaração de uma variável de instância do tipo List que armazenará os produtos da cesta
    private int quantidadeProdutos; // Declaração de uma variável de instância que controlará a quantidade de produtos na cesta

    public Cesta() { // Construtor da classe Cesta
        produtos = new ArrayList<>(); // Inicializa a lista de produtos como um novo ArrayList vazio
        quantidadeProdutos = 0; // Inicializa a quantidade de produtos como 0
    }

    public void adicionarProduto(Produto produto) { // Método para adicionar um produto à cesta
        if (quantidadeProdutos < 12) { // Verifica se a quantidade de produtos na cesta é menor que 12
            produtos.add(produto); // Adiciona o produto à lista de produtos
            quantidadeProdutos++; // Incrementa a quantidade de produtos
            System.out.println("Produto adicionado à cesta.");
        } else {
            System.out.println("A cesta está cheia. Não é possível adicionar mais produtos.");
        }
    }

    public double calcularTotal() { // Método para calcular o valor total da cesta
        double total = 0.0; // Variável local para armazenar o valor total da cesta
        for (Produto produto : produtos) { // Loop sobre cada produto na lista de produtos
            total += produto.getPreco() * produto.getQuantidade(); // Calcula o valor parcial do produto e adiciona ao total
        }
        return total; // Retorna o valor total da cesta
    }

    public void listarCesta() { // Método para listar os produtos da cesta
        for (Produto produto : produtos) { // Loop sobre cada produto na lista de produtos
            System.out.println("Tipo: " + produto.getClass().getSimpleName()); // Obtém o nome simplificado da classe do produto
            System.out.println("Preço unitário: " + produto.getPreco()); // Obtém o preço unitário do produto
            System.out.println("Quantidade: " + produto.getQuantidade()); // Obtém a quantidade do produto
            System.out.println();
        }
        System.out.println("Valor total da cesta: " + calcularTotal()); // Mostra o valor total da cesta
    }

    public void limparCesta() { // Método para limpar a cesta (remover todos os produtos)
        produtos.clear(); // Remove todos os produtos da lista
        quantidadeProdutos = 0; // Reseta a quantidade de produtos para 0
        System.out.println("A cesta foi limpa.");
    }
}