import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;
        int contador = 0;
        do {
            System.out.println("Digite um número positivo e digite um negativo para parar: ");
            numeroDigitado = sc.nextInt();
            contador++;
        }while (numeroDigitado> 0 );
        System.out.println("Foram digitados " + contador +" números positivos");
    }
}
