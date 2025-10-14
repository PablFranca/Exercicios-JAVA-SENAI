import java.sql.SQLOutput;
import java.util.Scanner;

public class Atleta {
    private String nome;
    private String modalidade;
    private int idade;
    private double pesoEmKg;
    private double alturaEmMetros;

    public Atleta(String nome, String modalidade, int idade, double peso, double altura){
        this.nome = nome;
        this.modalidade = modalidade;
        this.idade = idade;
        this.pesoEmKg = peso;
        this.alturaEmMetros = altura;
    }
    double calcularImc(){
        return pesoEmKg /(alturaEmMetros *alturaEmMetros);
    }
    String classificarCategoria(){

        double imc = calcularImc();
        String classificacao= "";

        if(imc > 0 && imc < 18.5){
            classificacao = "Abaixo do peso";
        }else if(imc > 18.5 && imc < 24.99){
            classificacao = "Peso Normal";
        }else if(imc > 24.9 && imc < 29.99){
            classificacao = "Sobrepeso";
        }else if(imc > 30 && imc < 34.99){
            classificacao = "Obesidade Grau 1";
        }else if(imc > 35 && imc < 39.99){
            classificacao = "Obesidade Grau 2";
        }else{
            classificacao = "Obesidade Mórbida";
        }
        return classificacao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atleta atleta;
        int opcao;

        do{
            System.out.println("Calculo de IMC de atletas: ");
            System.out.println("===========================");
            System.out.println("===========MENU============");
            System.out.println("1. Cadastrar novo atleta");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Verificar categoria");
            System.out.println("4. Atualizar informações");
            System.out.println("5. Sair");

            opcao = sc.nextInt();
            sc.nextLine();

        }while( opcao != 5);

        switch (opcao){
            case 1:
                System.out.println("Informe o nome do atleta");
                String nome = sc.nextLine();

                System.out.println("Informe a modalidade em que o atleta compete: ");
                String modalidade = sc.nextLine();

                System.out.println("Informe a idade do atleta");
                int idade = sc.nextInt();

                System.out.println("Informe o peso do atleta em Kilos");
                double peso = sc.nextDouble();

                System.out.println("Informe a altura do atleta em Metros");
                double altura = sc.nextDouble();

                atleta = new Atleta(nome, modalidade, idade, peso, altura);
                break;

            case 2:
                if( atleta != null ){
                    atleta.calcularImc();
                    break;

                }else{
                    System.out.println("Atleta não instanciado");
                    break;
                }

            case 3:
                if( atleta != null ){
                    atleta.classificarCategoria();
                    break;
                }else{
                    System.out.println("Atleta não instanciado");
                    break;
                }
            case 4:
                if( atleta != null ){

                    int dadoAAlterar;

                    do {
                        dadoAAlterar = sc.nextInt();
                        System.out.println("Digite o digito correspondente ao dado que deseja alterar, ou digite 4 para sair: ");
                        System.out.println();
                        System.out.println("============Menu===============");
                        System.out.println("1.Alterar nome: ");
                        System.out.println("2.Alterar peso:");
                        System.out.println("3.Alterar altura: ");
                    }while (dadoAAlterar!=4);

                    switch (dadoAAlterar){
                        case 1:
                            System.out.println("Altere seu nome:");
                            atleta.nome = sc.next();
                            break;
                        case 2:
                            System.out.println("Altere seu peso");
                            atleta.pesoEmKg = sc.nextDouble();
                            break;
                        case 3:
                            System.out.println("Altere sua altura");
                            atleta.alturaEmMetros = sc.nextDouble();
                            break;
                        case 4:
                            System.out.println("Os dados alterados foram salvos!");
                            break;
                        default:
                            System.out.println("Entrada Inválida");

                    }
                }else{
                    System.out.println("Um atleta não foi definido");
                }
        }
    }
}
