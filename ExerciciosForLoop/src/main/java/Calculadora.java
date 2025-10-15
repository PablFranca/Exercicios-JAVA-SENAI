import java.util.Scanner;

public class Calculadora {
    public static double soma(double x, double y) {
        return x + y;
    }

    public static double subtracao(double x, double y) {
        return x - y;
    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        if (y != 0) {
            return x / y;
        }
        System.out.println("Não é possível dividir pelo número 0!");
        return 0;
    }
    public static void main(String[] args) {
        String operadoresPermitidos = "[0+\\-*/]";
        Scanner sc = new Scanner(System.in);
        double v1, v2;
        String escolha;
        System.out.println("=================Calculadora===============");
        System.out.println("====Para selecionar uma operação, por favor====");
        System.out.println("digitar um digito correspondente ou sair com 0.");
        System.out.println("============ 0 ) SAIR=======================");
        System.out.println("============ + ) SOMA=======================");
        System.out.println("============ - ) SUBTRAÇÃO==================");
        System.out.println("============ * ) MULTIPLICAÇÃO==============");
        System.out.println("============ / ) DIVISÃO====================");

        do {
            System.out.println("Escolha: ");
            escolha = sc.nextLine();
            if (!escolha.matches(operadoresPermitidos)){
                System.out.println("Escolha inválida");
            }
            if (escolha.matches(operadoresPermitidos) || !escolha.equals("0") ) {
                System.out.println("Digite o primeiro valor: ");
                v1 = sc.nextDouble();

                System.out.println("Digite o segundo valor: ");
                v2 = sc.nextDouble();

                sc.nextLine();
                switch (escolha) {
                    case "+":
                        System.out.println("O resultado da soma é: " + soma(v1, v2));
                        break;
                    case "-":
                        System.out.println("O resultado da subtração é: " + subtracao(v1, v2));
                        break;
                    case "*":
                        System.out.println("O resultado da multiplicação é: " + multiplicacao(v1, v2));
                        break;
                    case "/":
                        System.out.println("O resultado da divisão é " + divisao(v1, v2));
                        break;
                    case "0":
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Valor Inválido!");
                        break;
                }

            }
        }while (escolha.length()==1);
        sc.close();
    }
}

