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

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cesta cesta = new Cesta();

        int opcao;
        do {
            System.out.println("Menu de opções:");
            System.out.println("[1]Colocar produto na cesta");
            System.out.println("[2]Mostrar conteúdo da cesta e valor total");
            System.out.println("[3]Limpar cesta");
            System.out.println("[0]Sair");
            System.out.print("Digite a opção desejada: ");
            
            opcao = scanner.nextInt();
            System.out.println();

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
                    int tipo = scanner.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    Produto produto = criarProduto(tipo, quantidade);
                    if (produto != null) {
                        cesta.adicionarProduto(produto);
                    }
                    System.out.println();
                    break;
                case 2:
                    cesta.listarCesta();
                    System.out.println();
                    break;
                case 3:
                    cesta.limparCesta();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número válido.");
                    System.out.println();
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
    private static Produto criarProduto(int tipo, int quantidade) {
        switch (tipo) {
            case 1:
                return new Banana(quantidade);
            case 2:
                return new Maca(quantidade);
            case 3:
                return new Pera(quantidade);
            case 4:
                return new Uva(quantidade);
            case 5:
                return new Morango(quantidade);
            case 6:
                return new Limao(quantidade);
            case 7:
                return new Mamao(quantidade);
            default:
                System.out.println("Tipo de produto inválido.");
                return null;
            }
        }
    }