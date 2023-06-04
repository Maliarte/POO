/* Uma loja de hortifruti colocou um serviço de venda pela internet.
 * A classe Cesta contém um lista de no máximo 12 produtos. 
 * Cada produto pode ser de um dos tipos (subclasses) derivados de Produto. 
 * Cada uma das subclasses define um valor fixo que vale para todos os objetos daquela classe 
 * e corresponde ao preço de cada unidade do produto. 
 * 
 * Na classe Cesta, o método adicionarProduto coloca um novo produto na cesta. 
 * Você dever usar uma variável de instância para controlar quantos produtos já estão ocupados. 
 * Quando estiver cheio, impeça a adição de novos produtos. 
 * 
 * O método calcularTotal faz o somatório dos preços dos produtos vezes quantidade de cada um dos produtos que estejam na cesta. 
 * 
 * O método listarCesta mostra cada um dos produtos da cesta, indicando o tipo de produto (banana, maça, etc.), o preço unitário e a quantidade; 
 * 
 * no final mostre o valor total da cesta. 
 * Perceba que a classe Produto é abstrata (está em itálico), 
 * bem como o método getPreco. 
 * 
 * Faça um programa principal que ofereça um menu de opções ao usuário: 
 * 
 * 1. colocar produto na cesta (usuário deve indicar o tipo e a quantidade); 
 * 2. mostrar o conteúdo da cesta e, ao final, o valor total da cesta;  
 * 3. limpar a cesta. 
 * 
 */

public static void main(String[] args) {
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
 
    // Cria um objeto Cesta para armazenar os produtos
    Cesta cesta = new Cesta();

    int opcao;
    // Inicia um loop que será executado até que a opção 0 (Sair) seja escolhida
    do {
        // Mostra o menu de opções para o usuário
        System.out.println("Menu de opções:");
        System.out.println("1. Colocar produto na cesta");
        System.out.println("2. Mostrar conteúdo da cesta e valor total");
        System.out.println("3. Limpar cesta");
        System.out.println("0. Sair");
        System.out.print("Digite a opção desejada: ");
     
        // Lê a opção digitada pelo usuário
        opcao = scanner.nextInt();
     
        System.out.println();

        // Utiliza um switch para executar o código correspondente à opção escolhida
        switch (opcao) {
            case 1:
                System.out.println("Tipos de produtos:");
                System.out.println("1. Banana");
                System.out.println("2. Maçã");
                System.out.println("3. Pera");
                System.out.println("4. Uva");
                System.out.println("5. Morango");
                System.out.println("6. Limão");
                System.out.println("7. Mamão");
                System.out.print("Digite o número do produto desejado: ");
          
                // Lê o tipo de produto escolhido pelo usuário
                int tipo = scanner.nextInt();
          
                System.out.print("Digite a quantidade: ");
          
                // Lê a quantidade do produto escolhida pelo usuário
                int quantidade = scanner.nextInt();
          
                // Cria um objeto Produto chamando o método criarProduto com o tipo e a quantidade escolhidos
                Produto produto = criarProduto(tipo, quantidade);
          
                // Verifica se o produto não é nulo (ou seja, foi criado corretamente)
                if (produto != null) {
                 
                    // Adiciona o produto à cesta
                    cesta.adicionarProduto(produto);
                 
                }
                System.out.println();
                break;
          
            case 2:
                // Lista os produtos presentes na cesta e mostra o valor total
                cesta.listarCesta();
                System.out.println();
                break;
          
            case 3:
                // Limpa a cesta, removendo todos os produtos
                cesta.limparCesta();
                System.out.println();
                break;
          
            case 0:
                // Encerra o programa
                System.out.println("Encerrando o programa...");
                break;
          
            default:
                // Caso a opção digitada não seja válida, exibe uma mensagem de erro
                System.out.println("Opção inválida. Digite um número válido.");
                System.out.println();
                break;
        }
    } while (opcao != 0);

    // Fecha o Scanner
    scanner.close();
}

private static Produto criarProduto(int tipo, int quantidade) {
    // Utiliza um switch para criar o objeto de produto correspondente ao tipo escolhido
    switch (tipo) {
        case 1:
            // Cria e retorna um objeto Banana com a quantidade escolhida
            return new Banana(quantidade);
        case 2:
            // Cria e retorna um objeto Maca com a quantidade escolhida
            return new Maca(quantidade);
        case 3:
            // Cria e retorna um objeto Pera com a quantidade escolhida
            return new Pera(quantidade);
        case 4:
            // Cria e retorna um objeto Uva com a quantidade escolhida
            return new Uva(quantidade);
        case 5:
            // Cria e retorna um objeto Morango com a quantidade escolhida
            return new Morango(quantidade);
        case 6:
            // Cria e retorna um objeto Limao com a quantidade escolhida
            return new Limao(quantidade);
        case 7:
            // Cria e retorna um objeto Mamao com a quantidade escolhida
            return new Mamao(quantidade);
        default:
            // Caso o tipo escolhido não seja válido, exibe uma mensagem de erro e retorna null
            System.out.println("Tipo de produto inválido.");
            return null;
    }
}
