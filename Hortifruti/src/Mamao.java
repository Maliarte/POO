class Mamao extends Produto {
    private static final double PRECO_UNITARIO = 3.5;

    public Mamao(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}