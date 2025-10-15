import java.util.Scanner;

public class Ex01 {
    //Exercício 1: Declaração e Uso
    //Crie um programa que declare variáveis para armazenar nome, idade e altura de uma pessoa, inicialize-as e imprima os valores.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Informe sua altura: ");
        double altura= entrada.nextDouble();


        System.out.println("Seu nome é: " +nome+",");
        System.out.println("sua idade é: " + idade+",");
        System.out.println("e sua altura é: "+ altura);

        entrada.close();
    }


}
