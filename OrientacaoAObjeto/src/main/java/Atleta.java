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
        }else if(imc >= 18.5 && imc <= 24.99){
            classificacao = "Peso Normal";
        }else if(imc >= 24.9 && imc <= 29.99){
            classificacao = "Sobrepeso";
        }else if(imc >= 30 && imc <= 34.99){
            classificacao = "Obesidade Grau 1";
        }else if(imc >= 35 && imc <= 39.99){
            classificacao = "Obesidade Grau 2";
        }else{
            classificacao = "Obesidade Mórbida";
        }
        return classificacao;
    }
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getModalidade() {return modalidade;}

    public void setModalidade(String modalidade) {this.modalidade = modalidade;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public double getPesoEmKg() {return pesoEmKg;}

    public void setPesoEmKg(double pesoEmKg) {this.pesoEmKg = pesoEmKg;}

    public double getAlturaEmMetros() {return alturaEmMetros;}

    public void setAlturaEmMetros(double alturaEmMetros) {this.alturaEmMetros = alturaEmMetros;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Atleta atleta = null;
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
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

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
                    System.out.println("Atleta " + atleta.getNome() +" criado com sucesso!");
                    break;

                case 2:
                    if( atleta != null ){
                        double imc = atleta.calcularImc();
                        System.out.println("O IMC do atleta é " + imc);

                    }else{
                        System.out.println("Nenhum atleta foi castrado!");

                    }break;

                case 3:
                    if( atleta != null ){
                        String classificacao = atleta.classificarCategoria();
                        System.out.println("A classificação do atleta "+ atleta.getNome()+" é "+classificacao);
                    }else{
                        System.out.println("Nenhum atleta foi cadastrado!");

                    }break;
                case 4:
                    if( atleta != null ){

                        int dadoAAlterar;

                            dadoAAlterar = sc.nextInt();
                            System.out.println("Digite o digito correspondente ao dado que deseja alterar, ou digite 4 para sair: ");
                            System.out.println();
                            System.out.println("============Menu===============");
                            System.out.println("1.Alterar nome: ");
                            System.out.println("2.Alterar peso:");
                            System.out.println("3.Alterar altura: ");
                            System.out.println("Opção: ");
                            dadoAAlterar = sc.nextInt();
                            sc.nextLine();


                        switch (dadoAAlterar){
                            case 1:
                                System.out.println("Altere seu nome:");
                                String novoNome = sc.nextLine();
                                atleta.setNome(novoNome);
                                break;
                            case 2:
                                System.out.println("Altere seu peso");
                                double novoPeso = sc.nextDouble();
                                atleta.setPesoEmKg(novoPeso);
                                break;
                            case 3:
                                System.out.println("Altere sua altura");
                                double novaAltura = sc.nextDouble();
                                atleta.setAlturaEmMetros(novaAltura);
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
        }while( opcao != 5);


    }
}
