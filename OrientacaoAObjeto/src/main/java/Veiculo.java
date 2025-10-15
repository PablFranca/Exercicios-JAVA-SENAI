import java.time.LocalDate;
import java.util.Scanner;

public class Veiculo {
    private final String modelo;
    private final String marca;
    private final int ano;
    private double quilometragem;

    public Veiculo(String modelo, String marca, int ano, double quilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    int calcularIdadeVeiculo() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }

    void atualizarQuilometragem(double valorAtualizado) {
        this.quilometragem = valorAtualizado;
    }

    void exibirInformacoes() {

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Quilometragem: " + this.quilometragem);
    }

    public static void main(String[] args) {
        Veiculo veiculo = null;
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        
        do {
        
            System.out.println("Bem vindo ao gerenciamento de veiculos: ");
            System.out.println("=================MENU===============");
            System.out.println("1. Cadastrar veiculo");
            System.out.println("2. Atualizar quilometragem");
            System.out.println("3. Calcular idade do veículo");
            System.out.println("4. Exibir informações");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Cadastro de veiculo:");
                    sc.nextLine();

                    System.out.println("Digite o modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Digite a marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite o ano: ");
                    int ano = sc.nextInt();

                    System.out.println("Digite a quilometragem: ");
                    double quilometragem = sc.nextDouble();

                    veiculo = new Veiculo(modelo, marca, ano, quilometragem);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    if (veiculo != null) {
                        System.out.println("Mudança de quilometragem, digite a quilometragem que deseja declarar: ");
                        double quilometragemAlterada = sc.nextDouble();
                        veiculo.atualizarQuilometragem(quilometragemAlterada);
                        System.out.println("A quilometragem foi alterada para " + quilometragemAlterada);
                    } else {
                        System.out.println("Veículo não definido, é preciso cadastrar um veículo para alterar sua quilometragem, cadastre um veiculo na opção 1");
                    }break;

                case 3:
                    if (veiculo != null) {
                        int idadeVeiculo = veiculo.calcularIdadeVeiculo();
                        System.out.println("A idade do veiculo é " + idadeVeiculo + " anos");
                    } else {
                        System.out.println(
                                "Veiculo não definido, é preciso cadastrar um veiculo para obter a sua idade.");
                    }
                    break;

                case 4:
                    if (veiculo != null) {
                        veiculo.exibirInformacoes();
                    } else {
                        System.out.println("Não ha um veículo cadastrado para mostrar informações");
                    }
                    break;
                case 5:
                    System.out.println("Você saiu do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (escolha != 5);
        sc.close();
    }
}
