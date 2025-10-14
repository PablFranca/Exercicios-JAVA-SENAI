import java.util.Scanner;

public class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, String codigo, int quantidade, double precoUnitario){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade =quantidade;
        this.precoUnitario = precoUnitario;
    }
    void adicionarEstoque(int quantidade){
        if (quantidade > 0){
        this.quantidade += quantidade;
        }
    }
    void removerEstoque(int quantidade){
        if(quantidade <= this.quantidade && quantidade> 0){
        this.quantidade -= quantidade;

        }else{
            System.out.println("Não foi possível remover a quantidade solicitada.");
        }
    }
    double calcularValorDoEstoque(){
        return precoUnitario * quantidade;
    }


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public double getPrecoUnitario() {return precoUnitario;}

    public void setPrecoUnitario(double precoUnitario) {this.precoUnitario = precoUnitario;}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = null;

        int opcao;

        do {
            System.out.println("Opções para produtos========");
            System.out.println();
            System.out.println("1 - Cadastrar novo produto: ");
            System.out.println("2 - Adicionar estoque");
            System.out.println("3 - Remover estoque");
            System.out.println("4 - Calcular valor total do estoque");
            System.out.println("5 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do produto");
                    String nomeDoProduto = sc.nextLine();

                    System.out.println("Informe o código do produto:");
                    String codigo = sc.nextLine();

                    System.out.println("Informe a quantidade em estoque");
                    int quantidade = sc.nextInt();

                    System.out.println("Informe o preço unitário");
                    double precoUnitario = sc.nextDouble();

                    produto = new Produto(nomeDoProduto, codigo, quantidade,precoUnitario);

                    break;

                case 2:
                    if (produto != null){
                        System.out.println("Informe a quantidade a adicionar: ");
                        int quantidadeAdicionada = sc.nextInt();
                        produto.adicionarEstoque(quantidadeAdicionada);
                        break;
                    }else{
                        System.out.println("Não há um produto para adicionar a quantidade, cadastre um na opção 1");
                        break;
                    }
                case 3:
                    if (produto != null){
                        System.out.println("Informe a quantidade a remover: ");
                        int quantidadeRemovida = sc.nextInt();
                        produto.removerEstoque(quantidadeRemovida);
                        break;
                    }else {
                        System.out.println("Não há um produto para remover a quantidade, adicione na opção 2");
                        break;
                    }
                case 4:
                    if (produto != null){
                        double valorTotalEstoque = produto.calcularValorDoEstoque();
                        System.out.println("O valor total do estoque de produtos é " + valorTotalEstoque);
                    }else{
                        System.out.println("Não há um produto ou quantidade para calcular");
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu sair, aplicação finalizada!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 5);
    }
}
