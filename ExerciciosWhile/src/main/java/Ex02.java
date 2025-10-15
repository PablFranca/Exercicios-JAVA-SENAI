import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Exercício 2: Validação de Nota com DO-WHILE
        //Peça ao usuário uma nota de 0 a 10. Continue pedindo até que ele digite um valor válido. Use DO-WHILE.
        System.out.println();
        System.out.println("Exercício 02");
        Scanner sc = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Digite uma nota de 0 a 10 : ");
            nota = sc.nextInt();

        }while (nota <= 0  || nota >= 10);
        sc.close();
    }
}
