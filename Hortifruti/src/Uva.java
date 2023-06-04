class Uva extends Produto {
    private static final double PRECO_UNITARIO = 3.2;

    public Uva(int quantidade) {
        super(quantidade);
    }

    @Override
    public double getPreco() {
        return PRECO_UNITARIO;
    }
}