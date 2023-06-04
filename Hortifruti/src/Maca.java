class Maca extends Produto {
    private static final double PRECO_UNITARIO = 1.5;

    public Maca(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}