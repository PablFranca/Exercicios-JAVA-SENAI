import java.util.Scanner;

public class EstacaoDoAno {

    String nomeDaEstacao;

    public static void main(String[] args) {

        EstacaoDoAno estacao = new EstacaoDoAno();
        int numeroDoMes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do mês: ");
        numeroDoMes = sc.nextInt();

        switch (numeroDoMes) {
            case 12:
            case 1:
            case 2:
                estacao.nomeDaEstacao = "Verão";
                break;
            case 3:
            case 4:
            case 5:
                estacao.nomeDaEstacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao.nomeDaEstacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao.nomeDaEstacao = "Primavera";

            default:
                System.out.println("Valor inválido!");
                break;
        }
        System.out.println(estacao.nomeDaEstacao);

    }
}