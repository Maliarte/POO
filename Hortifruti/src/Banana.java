class Banana extends Produto {
    private static final double PRECO_UNITARIO = 2.0;

    public Banana(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}