import java.util.ArrayList;
import java.util.Scanner;

public class CalculoDeSalarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Funcionario> funcionarios = new ArrayList<>();

        int opcao;


        do{
            System.out.println("---------------------Menu-----------------------");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Exibir informações de um funcionário:");
            System.out.println("3. Calcular e mostrar pagamento de um funcionário");
            System.out.println("4. Exibir total pago em salários pela empresa");
            System.out.println("5. Exibir funcionário com o maior salário");
            System.out.println("6. Sair.");
            System.out.println("------------------------------------------------");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:

                    System.out.println("Nome: ");
                    String nomeFuncionario = sc.nextLine();

                    System.out.println("Matricula: ");
                    String matriculaFuncionario = sc.nextLine();

                    System.out.println("Cargo: ");
                    String cargo = sc.nextLine().toUpperCase();


                    switch (cargo.toUpperCase()){
                        case "HORISTA":
                            System.out.println("Informe o preço da hora trabalhada: ");
                            double valorHoraTrabalhada = sc.nextDouble();

                            System.out.println("Informe a quantidade de horas trabalhadas: ");
                            double horasTrabalhadas = sc.nextDouble();
                            sc.nextLine();

                            funcionarios.add(new Horista(nomeFuncionario, matriculaFuncionario, Cargo.HORISTA, valorHoraTrabalhada, horasTrabalhadas));

                            break;

                        case "COMISSIONADO":
                            System.out.println("Informe o total vendido: ");
                            double totalDeVendas = sc.nextDouble();

                            System.out.println("Informe a porcentagem de comissão 0-100");
                            double taxaDeComissao = sc.nextDouble();
                            sc.nextLine();

                            funcionarios.add(new Comissionado(nomeFuncionario, matriculaFuncionario, Cargo.COMISSIONADO, totalDeVendas, taxaDeComissao));

                            break;

                        case "ASSALARIADO":
                        System.out.println("Informe o preço da hora trabalhada: ");
                            double salarioBase= sc.nextDouble();
                            System.out.println("Informe a porcentagem de comissão 0-100");

                            double bonusFixo = sc.nextDouble();
                            funcionarios.add(new Assalariado(nomeFuncionario, matriculaFuncionario, Cargo.ASSALARIADO, salarioBase, bonusFixo));
                            sc.nextLine();

                            break;
                        default:
                            System.out.println("Tipo de funcionário inválido !");
                    }
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("Informe o usuário do qual deseja informações");

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Valor inválido, escolha uma opção de 1 a 5 para gerenciar funcionarios ou 6 para sair!");
            }

        }while(opcao != 6);
        sc.close();
    }
}
