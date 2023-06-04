class Morango extends Produto {
    private static final double PRECO_UNITARIO = 2.5;

    public Morango(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}