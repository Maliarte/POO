class Pera extends Produto {
    private static final double PRECO_UNITARIO = 1.8;

    public Pera(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}