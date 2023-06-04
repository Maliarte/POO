abstract class Produto {
    private int quantidade;

    public Produto(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract double getPreco();

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}