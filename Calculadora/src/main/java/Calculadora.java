import java.util.Scanner;

public class Calculadora {
    private final double valor1;
    private final double valor2;
    private final Operacao operacao;

    public Calculadora(double valor1, double valor2, Operacao operacao) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;

    }
    public double calcular(){
        return operacao.calcular(valor1,valor2);
    }
    public static void main(String[] args) {
        double v1, v2;

        Scanner sc = new Scanner(System.in);
        String simboloOperador;
        do{
            System.out.println("------------Calculadora---------------");
            System.out.println("Menu de operações :");
            System.out.println("+ SOMA");
            System.out.println("- SUBTRAÇÃO");
            System.out.println("* MULTIPLICAÇÃO");
            System.out.println("/ DIVISÃO");
            System.out.println("Escolha uma operação: (+,-,*,/) ");
            simboloOperador = sc.nextLine();

            if(!simboloOperador.matches("^[+*/-]$")){
                System.out.println("Operador inválido, tente novamente!");
            }
        }while (!simboloOperador.matches("^[+*/-]$"));

        System.out.println("Digite o primeiro valor");
        v1 = sc.nextDouble();

        System.out.println("Digite o segundo valor");
        v2 = sc.nextDouble();

        sc.nextLine();

        Operacao op = Operacao.peloSimbolo(simboloOperador);

        Calculadora calc = new Calculadora(v1,v2,op);

        double resultado = calc.calcular();

        System.out.println("O resultado da operação de "+ op + " entre "+ v1 + " e " +v2 + " é "+ resultado );

        sc.close();
    }
}
