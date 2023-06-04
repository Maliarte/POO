class Banana extends Produto { //indica que a classe Banana é uma subclasse de Produto, herdando seus membros e comportamentos.
    private static final double PRECO_UNITARIO = 2.0; 
    //declara uma variável estática, final e do tipo double chamada PRECO_UNITARIO e a inicializa com o valor 1.5. 
    //Essa variável representa o preço unitário de uma unidade de banana.

    // define o construtor da classe Banana. Ele recebe um parâmetro quantidade, que é passado para o construtor da superclasse Produto por meio da chamada super(quantidade). 
    //Isso permite que a quantidade seja armazenada na variável quantidade definida na superclasse.
    public Banana(int quantidade) {
        super(quantidade);
    }

    //A linha @Override indica que o método a seguir está substituindo um método da superclasse. Nesse caso, estamos substituindo o método getPreco() da classe Produto.
   
    
    @Override
    public double getPreco() {//define a implementação do método getPreco() na classe Banana. Esse método retorna o preço unitário das bananas, que é definido pela variável PRECO_UNITARIO.
        return PRECO_UNITARIO;
    }
}
