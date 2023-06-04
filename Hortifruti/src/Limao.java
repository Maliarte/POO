class Limao extends Produto {
    private static final double PRECO_UNITARIO = 1.2;

    public Limao(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}