import java.util.Scanner;

public class Animal {
    private final String nome;
    private final String especie;
    private final int idade;
    private double peso;

    public Animal(String nome, String especie, int idade, double peso){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }
    int calcularIdadeEmAnosHumanos(){
        return this.idade * 7;
    }
    double getPeso(){
        return this.peso;
    }
    void setPeso(double novoPeso){
        this.peso = novoPeso;
    }
    String classificarPorte(){
        String porte;
        if (peso <= 0) {
            porte = "Peso Inválido";
        }else if( peso < 5){
            porte = "Mini";
        }else if(peso < 10){
            porte = "Pequeno";
        }else if(peso < 25){
            porte = "Médio";
        }else if(peso < 45){
            porte = "Grande";
        }else{
            porte = "Gigante";
        }
        return porte;
    }
    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: "+ peso);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        int opcao;

        do {
            System.out.println("Bem vindo ao gerenciamento de animais: ");
            System.out.println("=================MENU===============");
            System.out.println("1. Cadastrar animal");
            System.out.println("2. Atualizar peso");
            System.out.println("3. Calcular idade em anos humanos");
            System.out.println("4. Verificar porte");
            System.out.println("5. Exibir informações");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Animal:");
                    sc.nextLine();

                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite a especie: ");
                    String especie = sc.nextLine();

                    System.out.println("Digite a idade: ");
                    int ano = sc.nextInt();

                    System.out.println("Digite o peso: ");
                    double peso = sc.nextDouble();

                    animal = new Animal(nome, especie, ano, peso);
                    System.out.println("Animal cadastrado com sucesso!");
                    break;

                case 2:
                    if (animal != null) {
                        System.out.println("Atualização de peso do animal, digite o peso que deseja declarar: ");
                        double pesoAlterado = sc.nextDouble();
                        animal.setPeso(pesoAlterado);
                        System.out.println("O peso do animal foi alterado para " + animal.getPeso());
                    } else {
                        System.out.println("Veículo não definido, é preciso cadastrar um animal para alterar seu peso, cadastre um animal na opção 1");
                    }break;

                case 3:
                    if (animal != null) {
                        int idadeEmAnosHumanos = animal.calcularIdadeEmAnosHumanos();
                        System.out.println("A idade do veiculo é " + idadeEmAnosHumanos + " anos");
                    } else {
                        System.out.println(
                                "Animal não definido, é preciso cadastrar um animal para obter a sua idade em anos humanos.");
                    }
                    break;

                case 4:
                    if (animal != null) {
                        String porteDoAnimal = animal.classificarPorte();
                        System.out.println("O animal é de porte " + porteDoAnimal);
                    } else {
                        System.out.println("Não ha um animal cadastrado para mostrar informações");
                    }
                    break;
                case 5:
                    if(animal != null){
                        animal.exibirInformacoes();
                    }else{
                        System.out.println("Animal não cadastrado");
                    }
                    break;
                case 6:
                    System.out.println("Você saiu do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while (opcao != 6);
        sc.close();

    }
}
