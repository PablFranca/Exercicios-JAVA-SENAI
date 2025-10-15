import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada;
        int tentativas = 0 ;

        do{
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextLine();
            if(!senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha Incorreta!");
                tentativas++;
            }
            if(tentativas >= 3){
                System.out.println("Sistema bloqueado. \n Tente novamente mais tarde");
                break;
            }
        }while(!senhaDigitada.equals(senhaCorreta));
        if (senhaDigitada.equals(senhaCorreta)){
            System.out.println("Senha correta!");
        }
        System.out.println("Programa Finalizado!");
        sc.close();
    }
}

