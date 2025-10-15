import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //Exercício 5: Sistema de Login com 3 Tentativas
        //Crie um sistema que dá ao utilizador 3 tentativas para acertar a senha. Use WHILE ou DO-WHILE.

        String senha ="1234";
        Scanner sc = new Scanner(System.in);
        String senhaDigitada;
        int tentativas = 1;

        do{
            System.out.println("Digite a senha");
            senhaDigitada = sc.nextLine().trim();

            if(!senha.equals(senhaDigitada)){
                System.out.println("Você tentou " + tentativas + " vezes! " + "O limite são 3 vezes");
                tentativas++;
            }
            if (tentativas> 3) {
                System.out.println("Numero de tentativas excedido! Acesso bloqueado!");
                break;
            }
            System.out.println("Acesso permitido!");

        }while (!senha.equals(senhaDigitada));

    }
}
