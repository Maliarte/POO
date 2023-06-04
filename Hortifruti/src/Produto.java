abstract class Produto {
    private int quantidade; // Variável de instância que armazena a quantidade do produto

    public Produto(int quantidade) {// Construtor que recebe a quantidade do produto como argumento
        this.quantidade = quantidade;// Atribui o valor da quantidade passada como argumento à variável de instância
    }

    public abstract double getPreco();  // Método abstrato para obter o preço do produto

    public void setQuantidade(int quantidade) { // Método para definir a quantidade do produto
        this.quantidade = quantidade // Atribui o valor da quantidade passada como argumento à variável de instância
    }

    public int getQuantidade() { // Método para obter a quantidade do produto
        return quantidade; // Retorna o valor da quantidade do produto
    }
}
